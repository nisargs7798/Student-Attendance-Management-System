package addFaculty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import addStudent.addStudent;
import addSubjects.menuFrame;

public class addFaculty extends menuFrame{
	private JLabel lblFacID,lblFacName, lblFacDept,lblEmail, lblPassword, lblTitle;
	private JTextField txtFacID,txtFacName,txtEmail, txtPassword;
	private JButton jbtnAdd= new JButton("Add");
	
	private String[] courses = {"ITS", "Web dev","big data", "AI","BI"};
	
	private JComboBox jcboCourses = new JComboBox(courses);
	
	
	public addFaculty() {
		JPanel titlePanel = new JPanel();
		JPanel addFacPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(jbtnAdd);
		jbtnAdd.setMnemonic('D');
		lblTitle = new JLabel("Add New Faculty");
		lblFacID = new JLabel("Student ID: ", SwingConstants.CENTER);
		txtFacID = new JTextField();

		lblEmail = new JLabel("Password: ", SwingConstants.CENTER);
		txtEmail = new JTextField();
	
		lblPassword = new JLabel("Password: ", SwingConstants.CENTER);
		txtPassword = new JTextField();
		lblFacName = new JLabel("Name: ", SwingConstants.CENTER);
		txtFacName = new JTextField();
		
		lblFacDept = new JLabel("Course: ", SwingConstants.CENTER);
		
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(new Font("serif", Font.BOLD, 22));
		titlePanel.setBackground(Color.GREEN);
		titlePanel.add(lblTitle);
		addFacPanel.setBackground(Color.cyan);
		btnPanel.setBackground(Color.lightGray);
		jbtnAdd.setForeground(Color.BLUE);
		jbtnAdd.setBackground(Color.white);
		
		addFacPanel.setLayout(new GridLayout(6,2));
		addFacPanel.add(lblFacID);
		addFacPanel.add(txtFacID);
		addFacPanel.add(lblFacName);
		addFacPanel.add(txtFacName);
		addFacPanel.add(lblEmail);
		addFacPanel.add(txtEmail);
		addFacPanel.add(lblPassword);
		addFacPanel.add(txtPassword);
		
		addFacPanel.add(lblFacDept);
		addFacPanel.add(jcboCourses);
		
		jbtnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				dispose();
//				addSubjects frame = new addSubjects();
//				frame.setVisible(true);
//				frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//				frame.setLocationRelativeTo(null);
			}
		});
		
		setLayout(new BorderLayout());
		add(titlePanel, BorderLayout.NORTH);
		add(addFacPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		addFaculty frame = new addFaculty();
		frame.setTitle("Add Faculty");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
	}
}
