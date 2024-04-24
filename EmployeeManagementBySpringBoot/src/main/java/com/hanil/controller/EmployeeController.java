package com.hanil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hanil.entity.Employee;
import com.hanil.repo.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo emprepo;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/addemp")
	public String regPage()
	{
		return "reg";
	}
	@RequestMapping("/emp")
	public String empPage(Employee emp,ModelMap model)
	{
		emprepo.save(emp);
		return "success";
	}
	
	@RequestMapping("/viewallemps")
	public String viewAll(ModelMap model)
	{
		model.put("emp", emprepo.findAll());
		return "viewemps";
	}
	@RequestMapping("/delete/{empId}")
	public String deleteEmp(@PathVariable int empId)
	{
		emprepo.deleteById(empId);
		return "redirect:/viewemps";
	}
	@RequestMapping("/edit/{empId}")
	public String editPage(ModelMap model,@PathVariable int empId)
	{
		model.put("command", emprepo.findById(empId));
		return "edit";
	}
	@RequestMapping(value ="editemp",method = RequestMethod.GET)
	public String editEmp(Employee emp,ModelMap model)
	{
		emprepo.save(emp);
		return "redirect:/viewemps";
	}

}
