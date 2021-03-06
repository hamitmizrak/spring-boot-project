package com.hamit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hamit.utils.BookTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class BooksEntity extends BaseEntity {
	// N
	private static final long serialVersionUID = -7686620440912141762L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Long bookId;
	
	@Column(name = "book_name", unique = true, length = 150)
	private String bookName;
	
	@Column(name = "book_year_of_printing")
	private String bookYearOfPrinting;
	
	@Column(name = "book_version")
	private String bookVersion;
	
	@Column(name = "book_print_house")
	private String bookPrintingHouse;
	
	@Column(name = "book_type")
	@Enumerated(EnumType.STRING)
	private BookTypes bookType;
	
	// composition
	// @JsonIgnore
	// @ManyToOne(optional = false)
	// @JoinColumn(name = "writer_id", nullable = false)
	// private WriterEntity writerEntity;
	
}
