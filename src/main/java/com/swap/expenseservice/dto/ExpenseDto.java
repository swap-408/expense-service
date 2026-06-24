package com.swap.expenseservice.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseDto {

    private Long id;

    private String userEmail;

    private BigDecimal amount;

    private String currency;

    private String merchant;

    private String category;

    private String description;

    private LocalDate expenseDate;

    private String source;

    private String rawMessage;

    private String transactionType;

    private String bank;

    private String last4;

    private String transactionDateTime;

    private Double confidence;
}
