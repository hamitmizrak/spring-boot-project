package com.hamit.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BooksDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long bookId;
	
	private String bookName;
	
	private String bookYearOfPrinting;
	
	private String bookVersion;
	
	private String bookPrintingHouse;
	
	private WriterDto writerEntity;
	
}
