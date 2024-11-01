package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.StudentDao;
import com.ashokit.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public void saveAllStudents(List<Student> students) {
		List<Student> saveAll = studentDao.saveAll(students);
		saveAll.forEach(student -> System.out.println(student));
	}
}