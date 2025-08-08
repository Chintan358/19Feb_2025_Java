package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentOprations {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student st = context.getBean("std",Student.class);
		st.display();
		
		
		
	}
}
