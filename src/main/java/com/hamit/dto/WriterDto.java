package com.hamit.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class WriterDto implements Serializable {
	
	private static final long serialVersionUID = -9190714480247693530L;
	// NotNull ==> validation
	// @NonNull ==> lombok
	
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
	
	// private List<BooksDto> booksEntities;
	
	public static void main(String[] args) {
		// WriterDto writerDto = new WriterDto(0L, "writerName", "writerSurname",
		// "writerAge", "writerAddress",
		// "writerSocialMedia");
		// System.out.println(writerDto);
		//
		// WriterDto writerDto2 =
		// WriterDto.builder().writerAddress("adres").writerAge("yaş").writerId(10L)
		// .writerName("Hamit").writerSurname("Mızrak").writerSocialMedia("Linkedin").build();
		// System.out.println(writerDto2);
	}
}
