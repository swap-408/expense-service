package com.swap.expenseservice.kafka;

import com.swap.expenseservice.dto.ParsedExpenseDto;
import com.swap.expenseservice.dto.ExpenseDto;
import com.swap.expenseservice.service.ExpenseService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ExpenseConsumer {

    private final ExpenseService expenseService;

    public ExpenseConsumer(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @KafkaListener(topics = "expense.parsed", groupId = "expense-group")
    public void consume(ParsedExpenseDto parsedExpenseDto) {
        ExpenseDto expenseDto = new ExpenseDto();
        expenseDto.setAmount(parsedExpenseDto.getAmount());
        expenseDto.setMerchant(parsedExpenseDto.getMerchant());
        expenseDto.setCategory(parsedExpenseDto.getCategory());
        expenseDto.setDescription(parsedExpenseDto.getRawMessage());
        expenseDto.setExpenseDate(java.time.LocalDate.now());

        expenseService.createExpenseFromSms(parsedExpenseDto.getUserEmail(), expenseDto);
    }
}