package com.hamit.common;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamit.dto.WriterDto;
import com.hamit.service.impl.WriterServiceImpl;

@RestController
@RequestMapping("/writer/api")
public class WriterApi2 {
	@Autowired
	WriterServiceImpl bookServiceImpl;
	
	// 2.YOL
	// private final BooksServiceImpl bookServiceImpl2;
	// public BookApi(BooksServiceImpl bookServiceImpl2) {
	// this.bookServiceImpl2 = bookServiceImpl2;
	// }
	
	// Get
	@GetMapping("/get/{id}")
	public ResponseEntity<WriterDto> getById(@PathVariable("id") Long id) {
		WriterDto booksDto = bookServiceImpl.getById(id);
		return ResponseEntity.ok(booksDto);
	}
	
	// Post
	@PostMapping("/post")
	// @RequestBody
	public ResponseEntity<WriterDto> postApiBooks(@Valid @ModelAttribute WriterDto writerDto) {
		return ResponseEntity.ok(bookServiceImpl.getCreate(writerDto));
	}
}
