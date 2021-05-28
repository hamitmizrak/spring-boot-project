package com.hamit.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "Swapper Writer Dto")
public class WriterDto implements Serializable {
	
	private static final long serialVersionUID = -9190714480247693530L;
	// NotNull ==> validation
	// @NonNull ==> lombok
	@ApiModelProperty(value = " writerId")
	private Long writerId;
	
	@NotNull
	@ApiModelProperty(required = true, value = " writer name")
	private String writerName;
	
	@NotNull
	@ApiModelProperty(required = true, value = " writer Surname")
	private String writerSurname;
	
	@NotNull
	@ApiModelProperty(required = true, value = " writer Age",notes = "burasi yas alanidir.")
	private String writerAge;
	
	@NotNull
	@ApiModelProperty(required = true, value = " writer Address")
	private String writerAddress;
	
	@NotNull
	@ApiModelProperty(required = true, value = " writer writerSocialMedia")
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
