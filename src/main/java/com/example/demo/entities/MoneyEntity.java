package com.example.demo.entities;

import com.example.demo.utils.Transaction;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="money")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class MoneyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Transaction transaction;

    private double debitAmount;
    private double creditAmount;
    private double balanceAmount;

}
