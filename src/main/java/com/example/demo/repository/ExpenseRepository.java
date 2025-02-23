package com.example.demo.repository;

import com.example.demo.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {


    List<Expense> findByCategory(String category);


    @Query("SELECT e FROM Expense e WHERE e.date BETWEEN :start AND :end")
    List<Expense> findExpensesBetweenDates(@Param("start") LocalDate start, @Param("end") LocalDate end);

    List<Expense> findByDateBetween(LocalDate start, LocalDate end);
}