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

import lombok.extern.java.Log;

// ERSI(A) T
@Service
@Log
public class WriterServiceImpl implements WriterService {
	
	@Autowired
	WriterRepository writerRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Override
	public WriterDto getById(Long id) {
		WriterEntity writerEntity = writerRepository.getOne(id);
		// Entity'den Dto çevirmek
		log.info(WriterDto.class + " Veriler listelendi");
		return modelMapper.map(writerEntity, WriterDto.class);
	}
	
	@Override
	public WriterDto getCreate(WriterDto writerDto) {
		WriterEntity writerEntity = modelMapper.map(writerDto, WriterEntity.class);
		writerRepository.save(writerEntity);
		log.info(WriterDto.class + " Veriler eklendi");
		return modelMapper.map(writerEntity, WriterDto.class);
	}
	
	@Override
	public void getDeleteById(Long id) {
		try {
			log.info(id + " Veri silindi");
			writerRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: " + "veriler silinemedi");
		}
		
	}
	
	@Override
	public void getAllDelete() {
		try {
			writerRepository.deleteAll();
			log.info(WriterDto.class + " Veriler silindi");
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: ");
		}
		
	}
	
	@Override
	public void getUpdate(WriterDto writerDto, Long id) {
		
		try {
			WriterEntity writerEntity = writerRepository.findById(id).get();
			writerEntity.setWriterAddress(writerDto.getWriterAddress());
			writerEntity.setWriterAge(writerDto.getWriterAge());
			writerEntity.setWriterName(writerDto.getWriterName());
			writerEntity.setWriterSocialMedia(writerDto.getWriterSocialMedia());
			writerEntity.setWriterSurname(writerDto.getWriterSurname());
			writerRepository.save(writerEntity);
			log.info(WriterDto.class + " Veriler güncellendi");
		} catch (Exception e) {
			e.printStackTrace();
			log.warning("Hata: ");
		}
		
	}
	
	@Override
	public Page<WriterDto> getPaging(Pageable pageable) {
		return null;
	}
	
	///////////////////////////////////// LİST/////////////////////////////////////////////////
	// List<BooksEntity> bookEntity = new ArrayList<BooksEntity>();
	// List<BooksDto> dtos = new ArrayList<>();
	// bookEntity.forEach(booksTemp -> dtos.add(modelMapper.map(booksTemp,
	// BooksDto.class)));
	<S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
		return source.stream().map(element -> modelMapper.map(element, targetClass)).collect(Collectors.toList());
	}
	
	@Override
	public List<WriterDto> getAllWriterList() {
		List<WriterEntity> writerEntityList = new ArrayList<WriterEntity>();
		writerRepository.findAll().forEach(writerEntityList::add);
		List<WriterDto> writerDtoList = mapList(writerEntityList, WriterDto.class);
		log.info(WriterDto.class + " Veriler listelendi");
		return writerDtoList;
	}
	
}
