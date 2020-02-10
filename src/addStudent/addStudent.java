package addStudent;
import addSubjects.addSubjects;
import validator.*;
import addSubjects.menuFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addStudent extends menuFrame{
	private JLabel lblStudID, lblSemester,lblStudName, lblStudCourse,lblEmail, lblPassword, lblTitle;
	private JTextField txtStudID, txtSemester ,txtStudName,txtEmail, txtPassword;
	private JButton jbtnAdd= new JButton("Add");
	
	private String[] courses = {"ITS", "Web dev","big data", "AI","BI"};
	
	private JComboBox jcboCourses = new JComboBox(courses);
	
	
	public addStudent() {
		JPanel titlePanel = new JPanel();
		JPanel addStudPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(jbtnAdd);
		jbtnAdd.setMnemonic('D');
		lblTitle = new JLabel("Add New Student");
		lblStudID = new JLabel("Student ID: ", SwingConstants.CENTER);
		txtStudID = new JTextField();

		lblEmail = new JLabel("Email: ", SwingConstants.CENTER);
		txtEmail = new JTextField();
	
		lblPassword = new JLabel("Password: ", SwingConstants.CENTER);
		txtPassword = new JTextField();
		lblStudName = new JLabel("Name: ", SwingConstants.CENTER);
		txtStudName = new JTextField();
		lblSemester = new JLabel("Semester: ", SwingConstants.CENTER);
		txtSemester = new JTextField();
		lblStudCourse = new JLabel("Course: ", SwingConstants.CENTER);
		
		lblTitle.setForeground(Color.RED);
		lblTitle.setFont(new Font("serif", Font.BOLD, 22));
		titlePanel.setBackground(Color.GREEN);
		titlePanel.add(lblTitle);
		addStudPanel.setBackground(Color.cyan);
		btnPanel.setBackground(Color.lightGray);
		jbtnAdd.setForeground(Color.BLUE);
		jbtnAdd.setBackground(Color.white);
		
		addStudPanel.setLayout(new GridLayout(6,2));
		addStudPanel.add(lblStudID);
		addStudPanel.add(txtStudID);
		addStudPanel.add(lblStudName);
		addStudPanel.add(txtStudName);
		addStudPanel.add(lblEmail);
		addStudPanel.add(txtEmail);
		addStudPanel.add(lblPassword);
		addStudPanel.add(txtPassword);
		addStudPanel.add(lblSemester);
		addStudPanel.add(txtSemester);
		addStudPanel.add(lblStudCourse);
		addStudPanel.add(jcboCourses);
		
		jbtnAdd.addActionListener(new addStudentListener());
		
		setLayout(new BorderLayout());
		add(titlePanel, BorderLayout.NORTH);
		add(addStudPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
	}
	private class addStudentListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(isValidData()) {
				JOptionPane.showMessageDialog(null, "Student added successfully", "Add subjects", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}
	
	private boolean isValidData() {
		// TODO Auto-generated method stub
		if(!Validator.isInteger(txtStudID, "Student ID")) return false;
		if(!Validator.isPresent(txtStudName, "Student Name")) return false;
		if(!Validator.isPresent(txtEmail, "Email")) return false;
		if(!Validator.isPresent(txtPassword, "password")) return false;
		if(!Validator.isInteger(txtSemester, "Semester")) return false;
		
		return true;
	}
	public static void main(String[] args) {
		addStudent frame = new addStudent();
		frame.setTitle("Add Students");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
	}
}
