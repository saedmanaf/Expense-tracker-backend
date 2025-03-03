package com.example.expensetracker.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal amount;
    private String category;
    private LocalDate date;
    private String description;

    public Expense(Long id, String name, double amount, String category, LocalDate date, String description) {
        this.id = id;
        this.name = name;
        this.amount = BigDecimal.valueOf(amount);  // Convert double to BigDecimal
        this.category = "Uncategorized";  // Provide a default category
        this.date = LocalDate.now();  // Default date if not provided
        this.description = "";
    }

}
