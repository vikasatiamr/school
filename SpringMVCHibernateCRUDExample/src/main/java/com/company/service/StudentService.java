package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.StudentDAO;
import com.company.model.Student;

@Service("studentService")
public class StudentService {

	@Autowired
	StudentDAO studentDao;
	
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	@Transactional
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}
}
