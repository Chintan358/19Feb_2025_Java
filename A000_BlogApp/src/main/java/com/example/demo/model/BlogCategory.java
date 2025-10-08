package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="blog_category")
@Getter
@Setter
public class BlogCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title",length = 50)
	private String title;
	
	@OneToMany(mappedBy = "blogCategory",cascade = CascadeType.ALL)
	List<Blog> blogs;
	
	
	
	
}
