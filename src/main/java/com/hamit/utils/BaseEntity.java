package com.hamit.utils;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
	private static final long serialVersionUID = 3617738433106359755L;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date updated;
}
