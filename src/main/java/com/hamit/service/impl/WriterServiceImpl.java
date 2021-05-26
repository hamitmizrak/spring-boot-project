package com.hamit.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
	public void getDeleteById(Long id) {
		writerRepository.deleteById(id);
	}
	
	@Override
	public void getAllDelete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getUpdate(WriterDto writerDto, Long id) {
		// TODO Auto-generated method stub
		
	}
	
	// List<BooksEntity> bookEntity = new ArrayList<BooksEntity>();
	// List<BooksDto> dtos = new ArrayList<>();
	
	// bookEntity.forEach(booksTemp -> dtos.add(modelMapper.map(booksTemp,
	// BooksDto.class)));
	
	@Override
	public Page<WriterDto> getPaging(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	<S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
		return source.stream().map(element -> modelMapper.map(element, targetClass)).collect(Collectors.toList());
	}
	
	@Override
	public List<WriterDto> getAllWriterList() {
		List<WriterEntity> writerEntityList = new ArrayList<WriterEntity>();
		writerRepository.findAll().forEach(writerEntityList::add);
		
		List<WriterDto> writerDtoList = mapList(writerEntityList, WriterDto.class);
		
		return writerDtoList;
	}
	
}
