package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fid")
	private int id;
	
	@Column(name="fname")
	private String name;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(
			name = "faculty_course",
			joinColumns = @JoinColumn(name="fid"),
			inverseJoinColumns = @JoinColumn(name="cid")		
			)
	List<Course> courses;

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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	public void addCounrse(Course course)
	{
		if(courses==null)
		{
			courses=new ArrayList<Course>();
		}
		courses.add(course);
	}
	
	
}
