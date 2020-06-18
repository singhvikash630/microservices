package com.eureka.carloan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.carloan.entity.LoanType;

public interface CarLoanRepositry extends JpaRepository<LoanType, Long>{

}
