package com;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame();
		frame.setSize(900,700);
		frame.setVisible(true);
		frame.setTitle("Java Application");
		frame.setLayout(null);
		
		JLabel head = new JLabel("Student Registration");
		head.setBounds(160, 50, 250, 30);
		head.setFont(new Font("Calibri", Font.BOLD, 25));
		
		JLabel name = new JLabel("Name");
		name.setBounds(100,100,100,20);
		JTextField name1 = new JTextField();
		name1.setBounds(200, 100, 150, 20);
		
		JLabel email = new JLabel("Email");
		email.setBounds(100,130,100,20);
		JTextField email1 = new JTextField();
		email1.setBounds(200, 130, 150, 20);
		
		
		
		frame.add(head);
		frame.add(name);  
	
		frame.add(email);
		frame.add(name1);
		frame.add(email1);
	}
}
