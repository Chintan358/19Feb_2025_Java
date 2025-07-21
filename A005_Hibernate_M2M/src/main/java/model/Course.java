package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private int id;

	@Column(name = "cname")
	private String name;

	@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "faculty_course", joinColumns = @JoinColumn(name = "cid"), inverseJoinColumns = @JoinColumn(name = "fid")

	)
	List<Faculty> faculties;

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

	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

	public void addFaculties(Faculty faculty) {
		if (faculties == null) {
			faculties = new ArrayList<Faculty>();
		}
		faculties.add(faculty);
	}
}
