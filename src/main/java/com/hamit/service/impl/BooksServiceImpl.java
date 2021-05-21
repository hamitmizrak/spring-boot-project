package com.hamit.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hamit.dto.BooksDto;
import com.hamit.entity.BooksEntity;
import com.hamit.repository.BooksRepository;
import com.hamit.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public BooksDto getCreate(BooksDto booksDto) {
		BooksEntity booksEntity = modelMapper.map(booksDto, BooksEntity.class);
		booksRepository.save(booksEntity);
		return modelMapper.map(booksEntity, BooksDto.class);
	}
	
	@Override
	public void getDeleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public BooksDto getDelete(BooksDto booksDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BooksDto getUpdate(BooksDto booksDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<BooksDto> getPaging(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BooksDto getById2(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
