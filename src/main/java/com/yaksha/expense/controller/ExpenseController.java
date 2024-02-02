package com.yaksha.expense.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.expense.entity.Expense;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {

	@GetMapping("/")
	public String getForm(Model model, @RequestParam(required = false) Long id) {
		// write your logic here
		return "";
	}

	@PostMapping("/handleSubmit")
	public String submitForm(@Valid Expense expense, BindingResult result) {
		// write your logic here
		return "";
	}

	@RequestMapping(value = { "/expenses", "/search" })
	public String getExpenses(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "searchMonth", required = false) String searchMonth,
			@RequestParam(value = "theSearchYear", required = false) String theSearchYear,
			@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete/{id}")
	public String showFormForDelete(@PathVariable("id") Long id, Model theModel) {
		// write your logic here
		return "";
	}

}
