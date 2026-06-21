package com.swap.expenseservice.controller;

import com.swap.expenseservice.dto.ExpenseDto;
import com.swap.expenseservice.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ExpenseDto createExpense(@RequestBody ExpenseDto expenseDto) {
        return expenseService.createExpense(expenseDto);
    }
    @GetMapping("/{id}")
    public ExpenseDto getExpense(@PathVariable Long id) {
        return expenseService.getExpense(id);
    }
}