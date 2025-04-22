package com.intellect.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer bankId;
    private String bankName;
    private String ifscCode;
    private String branch;
}
