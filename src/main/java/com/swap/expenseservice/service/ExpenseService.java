package com.swap.expenseservice.service;

import com.swap.expenseservice.dto.CategorySummaryDto;
import com.swap.expenseservice.dto.ExpenseDto;
import com.swap.expenseservice.dto.MerchantSummaryDto;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ExpenseService {
    ExpenseDto createExpense(ExpenseDto expenseDto);

    Page<ExpenseDto> getAllExpenses(int page, int size, String sortBy);

    ExpenseDto getExpense(Long id);
    ExpenseDto updateExpense(Long id, ExpenseDto expenseDto);
    void deleteExpense(Long id);
    List<ExpenseDto> getExpensesByCategory(String category);
    List<ExpenseDto> getExpensesBySource(String source);
    List<ExpenseDto> getExpensesByExpenseDate(LocalDate expenseDate);
    List<ExpenseDto> getExpensesByDateRange(LocalDate startDate, LocalDate endDate);
    List<ExpenseDto> getExpensesByMerchant(String merchant);

    BigDecimal getTotalSpent();
    BigDecimal getMonthlySpent(int year, int month);
    List<CategorySummaryDto> getCategorySummary();
    List<MerchantSummaryDto> getMerchantSummary();
    BigDecimal getSpentBetween(LocalDate startDate, LocalDate endDate);
}
