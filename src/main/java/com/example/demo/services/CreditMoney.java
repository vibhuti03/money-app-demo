package com.example.demo.services;

import com.example.demo.repositories.MoneyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreditMoney {

    @Autowired
    private MoneyRepository moneyRepository;

    private int creditAmount(int amount){

    }

    public int getBalance(){
        return 400;
    }
}
