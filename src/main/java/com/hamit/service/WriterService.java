package com.hamit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hamit.dto.BooksDto;
import com.hamit.dto.WriterDto;

public interface WriterService {
	
	WriterDto getById(Long id);
	
	WriterDto getCreate(WriterDto writerDto);
	
	WriterDto getDeleteById(Long id);
	
	void getUpdate(WriterDto writerDto, Long id);
	
	List<BooksDto> getAllBookList();
	
	Page<WriterDto> getPaging(Pageable pageable);
	
}
