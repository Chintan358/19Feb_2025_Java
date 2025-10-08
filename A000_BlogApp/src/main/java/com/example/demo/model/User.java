package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name",length = 50)
	private String name;
	
	@Column(name="email", length = 100)
	private String email;
	
	@Column(name="phone",length = 20)
	private String phone;
	
	@Column(name="password", length = 200)
	private String password;
	
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="role_id")
	Role role;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	List<Blog> blogs;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	List<Review> reviews;
}
