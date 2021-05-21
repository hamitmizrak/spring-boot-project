package com.hamit.service;

import com.hamit.dto.WriterDto;

public interface WriterService {
	
	WriterDto getCreate(WriterDto writerDto);
	
	WriterDto getDelete(WriterDto writerDto);
	
	WriterDto getUpdate(WriterDto writerDto);
	
	WriterDto getById(WriterDto writerDto);
}
