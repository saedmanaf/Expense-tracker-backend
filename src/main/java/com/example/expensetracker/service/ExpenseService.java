package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense updateExpense(Long id, Expense newExpense) {
        return expenseRepository.findById(id)
                .map(expense -> {
                    expense.setName(newExpense.getName());
                    expense.setAmount(newExpense.getAmount());
                    expense.setCategory(newExpense.getCategory());
                    expense.setDate(newExpense.getDate());
                    expense.setDescription(newExpense.getDescription());
                    return expenseRepository.save(expense);
                })
                .orElseGet(() -> {
                    newExpense.setId(id);
                    return expenseRepository.save(newExpense);
                });
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    public List<Expense> getExpensesByCategory(String category) {
        return expenseRepository.findByCategory(category);
    }

    public List<Expense> getExpensesBetweenDates(LocalDate start, LocalDate end) {
        return expenseRepository.findExpensesBetweenDates(start, end);
    }

}

