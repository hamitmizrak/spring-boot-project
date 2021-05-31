package com.hamit.api.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamit.api.crud.ApiCrud;
import com.hamit.dto.WriterDto;
import com.hamit.service.impl.WriterServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/writer")
@Api(value = "/api/writer",description = "writer api 44  ") 
//@Log
//@Log4j
//@Log4j2
@Slf4j
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
	@ApiOperation(value = "Swapper Get listele ", response = WriterDto.class)
	public ResponseEntity<WriterDto> getById(@PathVariable("id44") Long id) {
		WriterDto writerDto = writerServiceImpl.getById(id);
		log.info("api 202 "+"ekleme");
		return ResponseEntity.ok(writerDto);
	}
	
	//paging
	// localhost:9292/api/writer/paging/0/5  ==> 0.sayfadaki 5'erli sayfala
	@Override
	@GetMapping("/paging/{pageNo}/{pageSize}")
	@ApiOperation(value = "Swapper Get Paging ", response = WriterDto.class)
	public ResponseEntity<List<WriterDto>> getByPagination(@PathVariable("pageNo") int no, @PathVariable("pageSize") int size) {

		return ResponseEntity.ok(writerServiceImpl.getPagingList(no, size));
	}
	
	// localhost:9292/api/writer/post
	@Override
	@PostMapping("/post")
	@ApiOperation(value = "Swapper Post ", response = WriterDto.class)
	// @RequestBody
	// @ModelAttribute
	public ResponseEntity<WriterDto> getPost(@ModelAttribute WriterDto writerDto) {
		log.info("api 2021 "+"post");
		return ResponseEntity.ok(writerServiceImpl.getCreate(writerDto));
	}
	
	// localhost:9292/api/writer/delete/1
	@Override
	@DeleteMapping("/delete/{id44}")
	@ApiOperation(value = "Swapper Delete ", response = WriterDto.class)
	public ResponseEntity<WriterDto> getDeleteById(@PathVariable("id44") Long id) {
		writerServiceImpl.getDeleteById(id);
		log.info("api 2021 "+" id silme");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	// localhost:9292/api/writer/delete/all
	@Override
	@DeleteMapping("/delete/all")
	@ApiOperation(value = "Swapper All Delete ", response = WriterDto.class)
	public ResponseEntity<WriterDto> getAllDelete() {
		writerServiceImpl.getAllDelete();
		log.info("api 2021 "+"  hepsini silmek");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
	@Override
	// localhost:9292/api/writer/update/1
	@PutMapping("/update/{id44}")
	@ApiOperation(value = "Swapper update ", response = WriterDto.class)
	public ResponseEntity<WriterDto> getUpdate(@PathVariable("id44") Long id, @ModelAttribute WriterDto writerDto) {
		writerServiceImpl.getUpdate(writerDto, id);
		log.info("api 2021"+" guncelleme");
		return ResponseEntity.ok(writerDto);
	}
	
	// localhost:9292/api/writer/get/list
	@Override
	@GetMapping("/get/list")
	@ApiOperation(value = "Swapper All List ", response = WriterDto.class)
	public ResponseEntity<List<WriterDto>>  getAllWriterList() {
		log.info("api 2021"+" listelemek");
		return ResponseEntity.ok(writerServiceImpl.getAllWriterList());
	}
	
}
