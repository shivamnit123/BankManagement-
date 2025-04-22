package com.intellect.banking.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class BankDto {
	private Integer bankId;
    private String bankName;
    private String ifscCode;
    private String branch;
}
