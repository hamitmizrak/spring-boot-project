package com.hamit.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WriterDto implements Serializable {
	
	private static final long serialVersionUID = -9190714480247693530L;
	
	private Long writerId;
	
	private String writerName;
	
	private String writerSurname;
	
	private String writerAge;
	
	private String writerAddress;
	
	private String writerSocialMedia;
	
	private List<BooksDto> booksEntities;
}
