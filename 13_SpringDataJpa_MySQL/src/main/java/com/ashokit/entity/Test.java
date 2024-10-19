package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ashokit_test")
public class Test {
	
	@Id
	@Column(name="test_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name="test_name")
	private String name;

}
