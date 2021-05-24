package com.hamit.service.impl;

import java.util.ArrayList;
import java.util.List;

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
	public BooksDto getDeleteById(Long id) {
		BooksEntity booksEntity = booksRepository.getOne(id);
		// Entity'den Dto çevirmek
		return modelMapper.map(booksEntity, BooksDto.class);
		
	}
	
	@Override
	public void getUpdate(BooksDto booksDto, Long id) {
		BooksEntity find = booksRepository.getOne(id);
		
		System.out.println(find.toString());
		find.setBookName(booksDto.getBookName());
		find.setBookPrintingHouse(booksDto.getBookPrintingHouse());
		booksRepository.save(find);
		
	}
	
	@Override
	public List<BooksDto> getAllBookList() {
		List<BooksEntity> bookEntity = new ArrayList<BooksEntity>();
		List<BooksDto> dtos = new ArrayList<>();
		bookEntity.forEach(booksTemp -> dtos.add(modelMapper.map(booksTemp, BooksDto.class)));
		return dtos;
	}
	
	@Override
	public Page<BooksDto> getPaging(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BooksDto getById(Long id) {
		BooksEntity booksEntity = booksRepository.getOne(id);
		// Entity'den Dto çevirmek
		return modelMapper.map(booksEntity, BooksDto.class);
	}
	
}
