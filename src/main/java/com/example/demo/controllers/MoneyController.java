package com.example.demo.controllers;

import com.example.demo.entities.MoneyEntity;
import com.example.demo.repositories.MoneyRepository;
import com.example.demo.request.TransactionRequest;
import com.example.demo.services.CreditMoney;
import com.example.demo.services.DebitMoney;
import com.example.demo.utils.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/money/v1api")
public class MoneyController {

    @Autowired
    private CreditMoney creditMoney;
    @Autowired
    private DebitMoney debitMoney;

    @Autowired
    private MoneyRepository moneyRepository;

    MoneyEntity.builder().build();

    moneyRepository.

    @GetMapping("/balance")
    public ResponseEntity<Object> getBalance(){
        return ResponseEntity.ok().body("Hello");
    }

    @PostMapping("/transact")
    public ResponseEntity<Object> creditMoney(
            @RequestBody TransactionRequest transactionRequest
            ){
        Transaction transaction = transactionRequest.getTransaction();
        int balance;
        if(transaction == Transaction.CREDIT){
           balance = creditMoney.getBalance();

        } else if (transaction == Transaction.DEBIT) {
            balance =debitMoney.getBalance();
        }
        else {
            return ResponseEntity.unprocessableEntity().body("Invalid Transaction Type");
        }
        return ResponseEntity.ok().body(balance);
    }

}
