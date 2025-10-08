package com.example.demo.exception;

public class ResourceNotFound extends RuntimeException {

	String resourcename;
	String fieldname;
	int resourceid;
	public ResourceNotFound(String resourcename,String fieldname,int resourceid) 
	{
		super(String.format("%s with %s : %s is not found",resourcename,fieldname,resourceid));
		this.resourcename=resourcename;
		this.fieldname=fieldname;
		this.resourceid=resourceid;
	}
}
