package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpOpration {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext2.xml");
		
		Emp emp = context.getBean("emp",Emp.class);
		emp.display();
		
	}
}
