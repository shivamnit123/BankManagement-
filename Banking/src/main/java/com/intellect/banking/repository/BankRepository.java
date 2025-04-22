package com.intellect.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellect.banking.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer>{
      
}
