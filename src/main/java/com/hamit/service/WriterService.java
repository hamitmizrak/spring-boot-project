package com.hamit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hamit.dto.WriterDto;

public interface WriterService {
	
	WriterDto getById(Long id);
	
	WriterDto getCreate(WriterDto writerDto);
	
	void getDeleteById(Long id);
	
	void getAllDelete(Long id);
	
	void getUpdate(WriterDto writerDto, Long id);
	
	Page<WriterDto> getPaging(Pageable pageable);
	
	List<WriterDto> getAllWriterList();
	
}
