package com.eureka.carloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.carloan.dao.CarLoanRepositry;
import com.eureka.carloan.entity.LoanType;

@Service
public class CarLoanService {
	
	@Autowired
	CarLoanRepositry repositry;
	
	public LoanType getLoanType(long id) {
		return repositry.findById(id).orElse(null);
	}

}
