package com.yaksha.training.expense.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.expense.entity.Expense;

@Controller
public class ExpenseController {

	@GetMapping("/")
	public String getForm(Model model, @RequestParam(required = false) Long id) {
		return "";
	}

	@PostMapping("/handleSubmit")
	public String submitForm(@Valid Expense expense, BindingResult result) {
		return "";
	}

	@GetMapping("/expenses")
	public String getExpenses(Model model) {
		return "";
	}
}
