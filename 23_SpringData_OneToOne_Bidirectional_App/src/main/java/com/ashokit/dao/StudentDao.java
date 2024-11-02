package com.ashokit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}