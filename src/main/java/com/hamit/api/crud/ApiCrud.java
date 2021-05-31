package com.hamit.api.crud;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ApiCrud<T> {
	
	// GET
	public ResponseEntity<T> getById(Long id);
	
	// POST
	public ResponseEntity<T> getPost(T dto);
	
	// DELETE
	public ResponseEntity<T> getDeleteById(Long id);
	
	// ALL DELETE
	public ResponseEntity<T> getAllDelete();
	
	// PUT
	public ResponseEntity<T> getUpdate(Long id, T dto);
	
	// All List
	public ResponseEntity<List<T>> getAllWriterList();
	
	public ResponseEntity<List<T>> getByPagination(int no, int size);
}
