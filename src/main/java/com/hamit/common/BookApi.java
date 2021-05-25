package com.hamit.common;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamit.dto.BooksDto;
import com.hamit.service.impl.BooksServiceImpl;

@RestController
@RequestMapping("/api")
public class BookApi {
	
	@Autowired
	BooksServiceImpl bookServiceImpl;
	
	// 2.YOL
	// private final BooksServiceImpl bookServiceImpl2;
	// public BookApi(BooksServiceImpl bookServiceImpl2) {
	// this.bookServiceImpl2 = bookServiceImpl2;
	// }
	
	// Get
	@GetMapping("/get/{id}")
	public ResponseEntity<BooksDto> getById(@PathVariable("id") Long id) {
		BooksDto booksDto = bookServiceImpl.getById(id);
		return ResponseEntity.ok(booksDto);
	}
	
	// Post
	@PostMapping("/post")
	// @ModelAttribute
	// @RequestBody
	public ResponseEntity<BooksDto> postApiBooks(@Valid @RequestBody BooksDto booksDto) {
		return ResponseEntity.ok(bookServiceImpl.getCreate(booksDto));
	}
}
