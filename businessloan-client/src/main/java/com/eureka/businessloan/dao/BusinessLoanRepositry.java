package com.eureka.businessloan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.businessloan.entity.LoanType;

public interface BusinessLoanRepositry extends JpaRepository<LoanType, Long>{

}
