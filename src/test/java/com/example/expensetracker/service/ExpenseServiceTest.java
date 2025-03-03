package com.example.expensetracker.service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) // Use Mockito
class ExpenseServiceTest {

    @Mock  // Mock the repository since the service depends on it
    private ExpenseRepository expenseRepository;

    @InjectMocks  // Inject mocks into the service
    private ExpenseService expenseService;

    private List<Expense> expenses;

    @BeforeEach
    void setUp() {
        expenses = Arrays.asList(
                new Expense(1L, "Coffee", BigDecimal.valueOf(5.0), "Food", LocalDate.now(), "Morning coffee"),
                new Expense(2L, "Movie", BigDecimal.valueOf(12.0), "Entertainment", LocalDate.now(), "Cinema ticket")
        );
    }

    @Test
    void shouldGetAllExpenses() {
        when(expenseRepository.findAll()).thenReturn(expenses);

        List<Expense> result = expenseService.getAllExpenses();

        assertEquals(2, result.size());
        verify(expenseRepository, times(1)).findAll(); // Ensure the method was called
    }

    @Test
    void shouldGetExpenseById() {
        when(expenseRepository.findById(1L)).thenReturn(Optional.of(expenses.get(0)));

        Optional<Expense> result = expenseService.getExpenseById(1L);

        assertEquals("Coffee", result.get().getName());
        verify(expenseRepository, times(1)).findById(1L);
    }

    @Test
    void shouldAddExpense() {
        Expense newExpense = new Expense(3L, "Gym", BigDecimal.valueOf(20.0), "Health", LocalDate.now(), "Monthly fee");

        when(expenseRepository.save(newExpense)).thenReturn(newExpense);

        Expense savedExpense = expenseService.addExpense(newExpense);

        assertEquals("Gym", savedExpense.getName());
        verify(expenseRepository, times(1)).save(newExpense);
    }
}
