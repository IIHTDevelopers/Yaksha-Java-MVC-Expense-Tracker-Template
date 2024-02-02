package com.yaksha.expense.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.expense.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	// write your logic here
	Page<Expense> findExpenseByDescYearAndMonth(@Param("keyword") String keyword, @Param("year") String year,
			@Param("month") String month, Pageable pageable);

	// write your logic here
	Integer getSumOfAmount(@Param("keyword") String keyword, @Param("year") String year, @Param("month") String month);

}
