package com.eureka.businessloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.businessloan.dao.BusinessLoanRepositry;
import com.eureka.businessloan.entity.LoanType;

@Service
public class BusinessLoanService {
	
	@Autowired
	BusinessLoanRepositry repositry;
	
	public LoanType getLoanType(long id) {
		return repositry.findById(id).orElse(null);
	}

}
