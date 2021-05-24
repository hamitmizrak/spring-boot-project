package com.hamit.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @Builder
public class WriterDto implements Serializable {
	
	private static final long serialVersionUID = -9190714480247693530L;
	
	private Long writerId;
	@NotNull
	private String writerName;
	@NotNull
	private String writerSurname;
	@NotNull
	private String writerAge;
	@NotNull
	private String writerAddress;
	@NotNull
	private String writerSocialMedia;
	@NotNull
	private List<BooksDto> booksEntities;
}
