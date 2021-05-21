package com.hamit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamit.entity.WriterEntity;
import com.hamit.repository.WriterRepository;
import com.hamit.service.WriterService;

// ERSI(A)
@Service
public class WriterServiceImpl implements WriterService {
	
	@Autowired
	WriterRepository writerRepository;
	
	@Override
	public WriterEntity getCreate(WriterEntity writerEntity) {
		return writerRepository.save(writerEntity);
	}
	
	@Override
	public WriterEntity getDelete(WriterEntity writerEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public WriterEntity getUpdate(WriterEntity writerEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public WriterEntity getById(WriterEntity writerEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
