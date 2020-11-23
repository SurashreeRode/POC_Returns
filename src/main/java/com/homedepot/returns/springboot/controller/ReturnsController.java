package com.homedepot.returns.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homedepot.returns.springboot.model.Returns;
import com.homedepot.returns.springboot.service.ReturnService;

@RestController
public class ReturnsController {
	
	@Autowired
	private ReturnService returnService;
	 
	@PostMapping("/returns")
	public ResponseEntity<Returns> getReturns(@RequestBody Returns returns) {
		
		ResponseEntity<Returns> response= returnService.callRomaAPI(returns);
		
		return response;
	}

}
