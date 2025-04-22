package com.intellect.banking.mapper;

import com.intellect.banking.dto.BankDto;
import com.intellect.banking.entity.Bank;



public class BankMapper {
	
    public static Bank MapDtoToEntity(BankDto bdto)
    {
    	// it is going to parameterized constructor--
    	return new Bank(bdto.getBankId(),
    			bdto.getBankName(),
    			bdto.getIfscCode(),
    			bdto.getBranch());
    }
    public static BankDto EntityToDto(Bank b)
    {
    	return new BankDto(b.getBankId(),
    			b.getBankName(),
    			b.getIfscCode(),
    			b.getBranch());
    }
}
