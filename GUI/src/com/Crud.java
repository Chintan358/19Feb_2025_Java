package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class Crud {

	private JFrame frame;
	private JTextField uname;
	private JTextField email;
	private JTextField phone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Crud window = new Crud();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Crud() {
		initialize();
		connection();
		load();
	}

	Connection cn  =null;
	private JTable table;
	private JTextField id;
	public void connection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/19feb_java","root","root");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void load()
	{
		try {
			PreparedStatement ps =
					cn.prepareStatement("select * from student");
			
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 764, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel.setBounds(280, 29, 209, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(46, 84, 64, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setBounds(46, 120, 64, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone");
		lblNewLabel_1_2.setBounds(46, 165, 64, 25);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		uname = new JTextField();
		uname.setBounds(113, 86, 130, 20);
		frame.getContentPane().add(uname);
		uname.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(113, 122, 130, 20);
		frame.getContentPane().add(email);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(113, 167, 130, 20);
		frame.getContentPane().add(phone);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String iUname =  uname.getText();
				String iEmail  =email.getText();
				String iPhone = phone.getText();
				
				try {
					PreparedStatement ps =
							cn.prepareStatement("insert into student values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, iUname);
					ps.setString(3, iEmail);
					ps.setString(4, iPhone);
					
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame,"Data inserted");
						uname.setText("");
						email.setText("");
						phone.setText("");
						load();
					}
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(113, 198, 130, 23);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(290, 84, 432, 216);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		table = new JTable();
		panel.add(table);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(113, 282, 130, 20);
		frame.getContentPane().add(id);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ID");
		lblNewLabel_1_2_1.setBounds(63, 280, 29, 25);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 int uid = Integer.parseInt(id.getText());
				
				 try {
					PreparedStatement ps =
							 cn.prepareStatement("delete from student where id=?");
					ps.setInt(1, uid);
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame, "Data deleted");
						load();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
			}
		});
		btnDelete.setBounds(113, 313, 130, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(113, 354, 130, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnUpdate_1 = new JButton("update");
		btnUpdate_1.setBounds(113, 232, 130, 23);
		frame.getContentPane().add(btnUpdate_1);
	}
}
