package com.homedepot.returns.springboot.service;

import org.springframework.http.ResponseEntity;

import com.homedepot.returns.springboot.model.Returns;


public interface ReturnService {
	
public ResponseEntity<Returns> callRomaAPI(Returns returns);

}
