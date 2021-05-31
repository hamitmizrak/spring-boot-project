package com.hamit.service;

import java.util.List;

import com.hamit.dto.WriterDto;

public interface WriterService {
	
	WriterDto getById(Long id);
	
	List<WriterDto> getPagingList(int no, int size);
	
	WriterDto getCreate(WriterDto writerDto);
	
	void getDeleteById(Long id);
	
	void getAllDelete();
	
	void getUpdate(WriterDto writerDto, Long id);
	
	List<WriterDto> getAllWriterList();
	
}
