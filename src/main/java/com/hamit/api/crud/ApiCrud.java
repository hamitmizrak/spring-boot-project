package com.hamit.api.crud;

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
	
}
