package com.bookstore.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.app.dto.ResponseDto;
import com.bookstore.app.service.UserService;


@RestController
public class ForgetPasswordController {

	@Autowired
	UserService userService;
	
	@CrossOrigin(origins="*")
	@GetMapping("/forget-password/{emailId}")
	public ResponseEntity<ResponseDto> getAllEmployeeData(@PathVariable String emailId) {
		ResponseDto userRegisterResponceDto = new ResponseDto("All the Users!", userService.forgetPasswordMailSender(emailId));
		return new ResponseEntity<ResponseDto>(userRegisterResponceDto, HttpStatus.OK);
	}
}
