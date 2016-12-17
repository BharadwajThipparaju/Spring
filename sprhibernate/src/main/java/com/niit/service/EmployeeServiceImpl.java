package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.EmployeeDAO;
import com.niit.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO EmployeeDAO;

	@Transactional(readOnly = true)
	public List<Employee> listEmployee() {
		return EmployeeDAO.listEmployee();
	}

}