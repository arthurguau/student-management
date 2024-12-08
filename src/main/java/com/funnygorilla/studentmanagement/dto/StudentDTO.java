package com.funnygorilla.studentmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
	
	@ToString.Include
	private Long id;
	@ToString.Include
	private String firstName;
	@ToString.Include
	private String lastName;
	@ToString.Include
	private String contact;
	@ToString.Include
	private String course;
}
