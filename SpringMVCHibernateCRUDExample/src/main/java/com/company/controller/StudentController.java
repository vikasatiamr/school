package com.company.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.model.Student;
import com.company.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getStudents(Model model) {
		
		List<Student> listOfStudents = studentService.getAllStudents();
		model.addAttribute("student", new Student());
		model.addAttribute("listOfStudents", listOfStudents);
		return "studentDetails";
	}

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(value = "/addStudent", headers = "Accept=application/json")
	public String addStudent(@ModelAttribute("student") Student student) {	
		if(student.getId()==0)
		{
			studentService.addStudent(student);
		}
		else
		{	
			studentService.updateStudent(student);
		}
		
		return "redirect:/getAllStudents";
	}

	@RequestMapping(value = "/updateStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateStudent(@PathVariable("id") int id,Model model) {
		 model.addAttribute("student", this.studentService.getStudent(id));
	        model.addAttribute("listOfStudents", this.studentService.getAllStudents());
	        return "studentDetails";
	}

	@RequestMapping(value = "/deleteStudent/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		 return "redirect:/getAllStudents";

	}	
}
