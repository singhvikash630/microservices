package com.eureka.carloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.carloan.entity.LoanType;
import com.eureka.carloan.service.CarLoanService;

@RestController
@RequestMapping("/carloan")
public class CarLoanController {

	@Autowired
	CarLoanService service;

	@GetMapping("/get/{id}")
	public LoanType getLoanType(@PathVariable long id) {
		return service.getLoanType(id);
	}
}
