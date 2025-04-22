package com.intellect.banking.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intellect.banking.dto.BankDto;
import com.intellect.banking.service.BankService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/banking")
public class BankController {
       @Autowired
       private BankService bankingservice;
       
       @PostMapping("/add-bank")
       public ResponseEntity<String> insert(@RequestBody BankDto bdto)
       {
    	   String response = bankingservice.insert(bdto);
		   return new ResponseEntity<>(response,HttpStatus.CREATED);
    	   
       }
       @GetMapping("/get-bank/{id}")
       public ResponseEntity<BankDto> getBankbyId(@PathVariable("id") Integer id)
       {
    	   BankDto response = bankingservice.getBankbyId(id);
    	   return new ResponseEntity<>(response,HttpStatus.OK);
    	   
       }
       @DeleteMapping("/delete-bank/{id}")
       public ResponseEntity<String> deleteBankbyId(@PathVariable("id") Integer id)
       {
    	   
    	   String response = bankingservice.deleteBankbyId(id);
		   return new ResponseEntity<>(response,HttpStatus.OK);
       }
       @GetMapping("/get-Allbank")
       public ResponseEntity<List<BankDto>> getAllBank()
       {
    	   List<BankDto>response = bankingservice.getAllBank();
    	   return new ResponseEntity<>(response,HttpStatus.OK);
    	   
       }
       @PutMapping("/update-bank/{id}")
       public ResponseEntity<String> update(@RequestBody BankDto bdto, @PathVariable("id") Integer id) {
           String response = bankingservice.update(bdto, id);
           if (response.equals("Bank record not found")) {
               return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
           }
           return new ResponseEntity<>(response, HttpStatus.OK);
       }

}
