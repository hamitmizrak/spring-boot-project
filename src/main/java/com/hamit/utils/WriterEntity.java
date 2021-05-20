package com.hamit.utils;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

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
// 1
public class WriterEntity extends BaseEntity {
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
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date tarihhhh;
	
	// composition
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "writerEntity", targetEntity = BooksEntity.class)
	private List<BooksEntity> booksEntities;
}
