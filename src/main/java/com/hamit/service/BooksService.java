package com.hamit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hamit.dto.BooksDto;

public interface BooksService {
	
	BooksDto getById(Long id);
	
	BooksDto getCreate(BooksDto booksDto);
	
	List<BooksDto> getAllBookList();
	
	BooksDto getDeleteById(Long id);
	
	void getUpdate(BooksDto booksDto, Long id);
	
	Page<BooksDto> getPaging(Pageable pageable);
	
}
