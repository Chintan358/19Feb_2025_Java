package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="review")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="user_id")
	User user;
	
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="blog_id")
	Blog blog;
	
}
