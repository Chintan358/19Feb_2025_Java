package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="blog")
@Getter
@Setter
public class Blog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;
	
	@Column(name="image")
	private String image;
	
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="blogcat_id")
	BlogCategory blogCategory;
	
	@ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="user_id")
	User user;
	
	@OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
	List<Review> reviews;
	
}
