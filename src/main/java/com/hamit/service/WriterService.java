package com.hamit.service;

import com.hamit.entity.WriterEntity;

public interface WriterService {
	
	WriterEntity getCreate(WriterEntity writerEntity);
	
	WriterEntity getDelete(WriterEntity writerEntity);
	
	WriterEntity getUpdate(WriterEntity writerEntity);
	
	WriterEntity getById(WriterEntity writerEntity);
}
