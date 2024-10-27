package com.example.demo.request;

import com.example.demo.utils.Transaction;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {
    private Transaction transaction;
    private double amount;
}
