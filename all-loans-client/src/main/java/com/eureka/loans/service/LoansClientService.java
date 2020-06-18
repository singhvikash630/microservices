package com.eureka.loans.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eureka.loans.models.LoanType;

@Service
public class LoansClientService {

	@Autowired
	RestTemplate restTemplate;

	public List<LoanType> getLoans() {
		LoanType homeLoan = restTemplate.getForObject("http://homeloan-client/homeloan/get/1", LoanType.class);
		LoanType carloan = restTemplate.getForObject("http://carloan-client/carloan/get/2", LoanType.class);
		LoanType businessloan = restTemplate.getForObject("http://businessloan-client/businessloan/get/3",
				LoanType.class);
		return Arrays.asList(homeLoan, carloan, businessloan);
	}

}
