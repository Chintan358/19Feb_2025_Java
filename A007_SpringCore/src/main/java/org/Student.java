package org;

import java.util.List;
import java.util.Set;

public class Student {
	
	int id;
	String name;
	String email;
	List<String> subjects;
	Set<String> lang;
	Address adr;
	List<Info> info;
	
	
	
	public List<Info> getInfo() {
		return info;
	}
	public void setInfo(List<Info> info) {
		this.info = info;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Set<String> getLang() {
		return lang;
	}
	public void setLang(Set<String> lang) {
		this.lang = lang;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
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
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
		for(String s : subjects)
		{
			System.out.println(s);
		}
		
		for(String s : lang)
		{
			System.out.println(s);
		}
		
		adr.display();
		
		for(Info f: info)
		{
			f.display();
		}
	}
	
	
	
	
}
