package com.example.demo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;




@Entity
@Table(name="student")
public class Student {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "name should not be blank")
	private String name;
	
	
	@Size(min = 1,message = "Email should not be blank")
	@Email(message = "Invalid email format")
	private String email;
	
	private String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
