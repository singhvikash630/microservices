package com.eureka.businessloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.businessloan.entity.LoanType;
import com.eureka.businessloan.service.BusinessLoanService;

@RestController
@RequestMapping("/businessloan")
public class BusinessLoanController {

	@Autowired
	BusinessLoanService service;

	@GetMapping("/get/{id}")
	public LoanType getLoanType(@PathVariable long id) {
		return service.getLoanType(id);
	}
}
