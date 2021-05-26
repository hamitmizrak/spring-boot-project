package com.hamit.api.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamit.api.crud.ApiCrud;
import com.hamit.dto.WriterDto;
import com.hamit.service.impl.WriterServiceImpl;

@RestController
@RequestMapping("/api/writer")
public class WriterApi implements ApiCrud<WriterDto> {
	
	@Autowired
	WriterServiceImpl writerServiceImpl;
	
	// @GetMapping ==> Get (Listeleme)
	// @PostMapping ==> Post (Ekleme)
	// @DeleteMApping ==> Delete (Silmek)
	// @PutMapping ==> Put (Guncellemek)
	
	// private final WriterServiceImpl serviceImpl2;
	// public WriterApi(WriterServiceImpl serviceImpl2) {
	// this.serviceImpl2 = serviceImpl2;
	// }
	
	// localhost:9292/api/writer/get/chooise/1
	@Override
	@GetMapping("/get/chooise/{id44}")
	public ResponseEntity<WriterDto> getById(@PathVariable("id44") Long id) {
		WriterDto writerDto = writerServiceImpl.getById(id);
		return ResponseEntity.ok(writerDto);
	}
	
	// localhost:9292/api/writer/post
	@Override
	@PostMapping("/post")
	// @RequestBody
	// @ModelAttribute
	public ResponseEntity<WriterDto> getPost(@ModelAttribute WriterDto writerDto) {
		return ResponseEntity.ok(writerServiceImpl.getCreate(writerDto));
	}
	
	@Override
	// localhost:9292/api/writer/delete/1
	@DeleteMapping("/delete/{id44}")
	public ResponseEntity<WriterDto> getDeleteById(@PathVariable("id44") Long id) {
		writerServiceImpl.getDeleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@Override
	public ResponseEntity<WriterDto> getAllDelete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<WriterDto> getUpdate(Long id, WriterDto writerDto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
