package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listEmployees(Model model) {
		model.addAttribute("employee", employeeService.listEmployee());
		return "employee";
	}
	
	
	}
	
		
