package com.example.expensetracker.controller;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.service.ExpenseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExpenseController.class) // Only loads ExpenseController
@ExtendWith(SpringExtension.class)
@Import(ExpenseControllerTest.TestConfig.class) // Import test config with mocked bean
class ExpenseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ExpenseService expenseService;

    static class TestConfig {
        @Bean
        public ExpenseService expenseService() {
            return Mockito.mock(ExpenseService.class);
        }
    }

    @Test
    void shouldGetAllExpenses() throws Exception {
        List<Expense> expenses = Arrays.asList(
                new Expense(1L, "Coffee", BigDecimal.valueOf(5.0), "Food", LocalDate.now(), "Morning coffee"),
                new Expense(2L, "Movie", BigDecimal.valueOf(12.0), "Entertainment", LocalDate.now(), "Cinema ticket"),
                new Expense(3L, "Internet", BigDecimal.valueOf(30.0), "Utilities", LocalDate.now(), "Monthly bill")
        );

        when(expenseService.getAllExpenses()).thenReturn(expenses);

        mockMvc.perform(get("/api/expenses")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3)) // Fix the JSON path issue
                .andExpect(jsonPath("$[0].description").value("Morning coffee"));
    }
}
