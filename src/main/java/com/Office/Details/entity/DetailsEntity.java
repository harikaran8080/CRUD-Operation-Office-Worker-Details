package com.Office.Details.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "OfficeDetails")
public class DetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "roll")
	private String roll;
	@Column(name = "experience")
	private String experience;
	

}
