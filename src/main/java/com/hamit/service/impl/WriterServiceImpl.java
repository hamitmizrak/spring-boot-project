package com.hamit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamit.dto.WriterDto;
import com.hamit.repository.WriterRepository;
import com.hamit.service.WriterService;

// ERSI(A) T
@Service
public class WriterServiceImpl implements WriterService {
	
	@Autowired
	WriterRepository writerRepository;
	
	@Override
	public WriterDto getCreate(WriterDto writerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public WriterDto getDelete(WriterDto writerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public WriterDto getUpdate(WriterDto writerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public WriterDto getById(WriterDto writerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
