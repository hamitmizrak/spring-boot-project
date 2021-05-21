package com.hamit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity()
@Table(name = "writer")

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WriterEntity extends BaseEntity {
	// 1
	private static final long serialVersionUID = 2913520780398606041L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "writer_id")
	private Long writerId;
	
	@Column(name = "writer_name", length = 100)
	private String writerName;
	
	@Column(name = "writer_surname", length = 150)
	private String writerSurname;
	
	@Column(name = "writer_age", length = 4)
	private String writerAge;
	
	@Column(name = "writer_address", length = 400)
	private String writerAddress;
	
	@Column(name = "writer_social_media", length = 40)
	private String writerSocialMedia;
	
	// composition
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "writerEntity")
	private List<BooksEntity> booksEntities;
}
