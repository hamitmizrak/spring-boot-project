package com.hamit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hamit.dto.BooksDto;

public interface BooksService {
	
	BooksDto getCreate(BooksDto booksDto);
	
	void getDeleteById(Long id);
	
	BooksDto getDelete(BooksDto booksDto);
	
	BooksDto getUpdate(BooksDto booksDto);
	
	Page<BooksDto> getPaging(Pageable pageable);
	
	BooksDto getById2(Long id);
}
