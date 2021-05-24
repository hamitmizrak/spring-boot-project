package com.hamit.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NonNull // Lombok
// @NotNull // validation
public class BooksDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long bookId;
	@NotNull
	private String bookName;
	@NotNull
	private String bookYearOfPrinting;
	@NotNull
	private String bookVersion;
	@NotNull
	private String bookPrintingHouse;
	
	private WriterDto writerEntity;
	
}
