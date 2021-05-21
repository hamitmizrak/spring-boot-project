package com.hamit.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hamit.entity.BooksEntity;

public interface BooksService {
	
	BooksEntity getCreate(BooksEntity booksEntity);
	
	void getDeleteById(Long id);
	
	BooksEntity getDelete(BooksEntity booksEntity);
	
	BooksEntity getUpdate(BooksEntity booksEntity);
	
	Page<BooksEntity> getPaging(Pageable pageable);
	
	BooksEntity getById2(Long id);
}
