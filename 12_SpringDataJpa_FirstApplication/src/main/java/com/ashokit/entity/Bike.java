package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name="ashokit_bikes")
public class Bike {
	
	@Id
	@Column(name="bike_id")
	@GeneratedValue(strategy = GenerationType.TABLE,generator = "bikes")
	@TableGenerator(
	        name="bikes",
	        table="sequence_store",
	        pkColumnName = "seq_name",
	        valueColumnName = "seq_value",
	        pkColumnValue="bike_seq_id",
	        initialValue=1,
	        allocationSize=1
	    )
	private Integer bikeId;
	
	@Column(name="bike_name")
	private String name;
	
	public Bike() {
		
	}

	public Bike(String name) {
		this.name = name;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
