package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="ashokit_courses")
public class Course {
	
	@Id
	@Column(name="course_id")
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "courses")
	@TableGenerator(
	        name="courses",
	        table="sequence_store",
	        pkColumnName = "seq_name",
	        valueColumnName = "seq_value",
	        pkColumnValue="course_seq_id",
	        initialValue=1,
	        allocationSize=1
	    )
	private Integer id;
	
	@Column(name="course_name")
	private String name;

}
