package com.swap.expenseservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;

    private BigDecimal amount;

    private String currency;

    private String merchant;

    private String category;

    private String description;

    private LocalDate expenseDate;

    private String source;

    @Column(length = 5000)
    private String rawMessage;

    private String transactionType;

    private String bank;

    private String last4;

    private String transactionDateTime;

    private Double confidence;
}
