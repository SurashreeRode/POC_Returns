package com.homedepot.returns.springboot.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.homedepot.returns.springboot.model.Returns;
import com.homedepot.returns.springboot.service.ReturnService;

@Service
public class ReturnServiceImpl implements ReturnService {

	@Override
	public ResponseEntity<Returns> callRomaAPI(Returns returns) {
		/**
		 * RoamAPI Service call
		 */
		//RestTemplate template = new RestTemplate();
		//template.exchange(url, method, requestEntity, responseType, uriVariables)

		return new ResponseEntity(returns, HttpStatus.CREATED);
	}

}
