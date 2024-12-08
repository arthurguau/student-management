package com.funnygorilla.studentmanagement.repository.dataaccess;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity  
@Table(name = "student")
public class StudentDB implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	public StudentDB (String firstName, String lastName, String contact, String course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.course = course;
	}
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="student_id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "CONTACT")
	private String contact;
	
	@Column(name = "COURSE")
	private String course;
}
