package com.hamit.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hamit.dto.BooksDto;
import com.hamit.dto.WriterDto;
import com.hamit.entity.WriterEntity;
import com.hamit.repository.WriterRepository;
import com.hamit.service.WriterService;

// ERSI(A) T
@Service
public class WriterServiceImpl implements WriterService {
	
	@Autowired
	WriterRepository writerRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public WriterDto getById(Long id) {
		WriterEntity writerEntity = writerRepository.getOne(id);
		// Entity'den Dto çevirmek
		return modelMapper.map(writerEntity, WriterDto.class);
	}
	
	@Override
	public WriterDto getCreate(WriterDto writerDto) {
		WriterEntity writerEntity = modelMapper.map(writerDto, WriterEntity.class);
		writerRepository.save(writerEntity);
		return modelMapper.map(writerEntity, WriterDto.class);
	}
	
	@Override
	public WriterDto getDeleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void getUpdate(WriterDto writerDto, Long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<BooksDto> getAllBookList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<WriterDto> getPaging(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
