package com.hamit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hamit.entity.BooksEntity;
import com.hamit.repository.BooksRepository;
import com.hamit.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Override
	public BooksEntity getCreate(BooksEntity booksEntity) {
		return booksRepository.save(booksEntity);
	}
	
	@Override
	public void getDeleteById(Long id) {
		booksRepository.deleteById(id);
		
	}
	
	@Override
	public BooksEntity getDelete(BooksEntity booksEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BooksEntity getUpdate(BooksEntity booksEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Page<BooksEntity> getPaging(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BooksEntity getById2(Long id) {
		return booksRepository.getOne(id);
	}
	
}
