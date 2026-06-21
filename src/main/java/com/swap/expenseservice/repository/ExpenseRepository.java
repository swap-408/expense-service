package com.swap.expenseservice.repository;


import com.swap.expenseservice.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
