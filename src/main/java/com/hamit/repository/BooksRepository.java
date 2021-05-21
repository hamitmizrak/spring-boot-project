package com.hamit.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamit.entity.BooksEntity;

@Repository
public interface BooksRepository extends JpaRepository<BooksEntity, Long> {
	List<BooksEntity> getByBookName(String bookName);
	
	List<BooksEntity> getByBookNameContains(String bookName);
	
	List<BooksEntity> findAll(Sort sort);
	
	Page<BooksEntity> findAll(Pageable pageable);
	
	List<BooksEntity> getAllByBookNameAndBookIdNotNull(String bookName);
	
	List<BooksEntity> getAllByBookNameAndBookVersionContains(String bookName, String bookVersion);
}
