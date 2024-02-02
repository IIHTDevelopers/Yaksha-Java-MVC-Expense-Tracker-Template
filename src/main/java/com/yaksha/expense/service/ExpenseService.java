package com.yaksha.expense.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.expense.entity.Expense;

@Service
public class ExpenseService {

	public Expense addExpense(Expense expense) {
		// write your logic here
		return null;
	}

	public Expense updateExpense(Expense expense, Expense existing) {
		// write your logic here
		return null;
	}

	public List<Expense> getExpenses() {
		// write your logic here
		return null;
	}

	public Expense getExpenseById(Long id) {
		// write your logic here
		return null;
	}

	public Expense submitExpense(Expense expense) {
		// write your logic here
		return null;
	}

	public Page<Expense> getExpenses(String desc, String month, String year, Pageable pageable) {
		// write your logic here
		return null;
	}

	public boolean deleteExpenseById(Long id) {
		// write your logic here
		return false;
	}

	public Integer totalExpense(String desc, String month, String year) {
		// write your logic here
		return null;
	}

}
