package com.hamit.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamit.entity.WriterEntity;

@Repository
public interface WriterRepository extends JpaRepository<WriterEntity, Long> {
	
	List<WriterEntity> getByWriterName(String writerName);
	
	List<WriterEntity> getByWriterNameContains(String writerName);
	
	List<WriterEntity> findAll(Sort sort);
}
