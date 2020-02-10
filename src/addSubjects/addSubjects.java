package addSubjects;

import javax.swing.*;
import validator.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addSubjects extends menuFrame{

	private JLabel lblYear, lblSemester,lblSubjCode, lblsubjName, lblTitle;
	private JTextField txtYear, txtSemester ,txtSubjCode, txtSubjName;
	private JButton jbtnAdd= new JButton("Add");
	
	
	public addSubjects() {
		JPanel titlePanel = new JPanel();
		JPanel addSubjPanel = new JPanel();
		JPanel btnPanel = new JPanel();
		
		btnPanel.add(jbtnAdd);
		jbtnAdd.setMnemonic('D');
		lblTitle = new JLabel("Add New Subject");
		lblYear = new JLabel("Year", SwingConstants.CENTER);
		txtYear = new JTextField();
		lblSemester = new JLabel("Semester", SwingConstants.CENTER);
		txtSemester = new JTextField();
		lblSubjCode = new JLabel("Subject Code", SwingConstants.CENTER);
		txtSubjCode = new JTextField();
		lblsubjName = new JLabel("Subject Title", SwingConstants.CENTER);
		txtSubjName = new JTextField();
		
		lblTitle.setBackground(Color.red);
		lblTitle.setFont(new Font("serif", Font.BOLD, 22));
		
		titlePanel.add(lblTitle);

		addSubjPanel.setLayout(new GridLayout(4,2));
		addSubjPanel.add(lblYear);
		addSubjPanel.add(txtYear);
		addSubjPanel.add(lblSemester);
		addSubjPanel.add(txtSemester);
		addSubjPanel.add(lblSubjCode);
		addSubjPanel.add(txtSubjCode);
		addSubjPanel.add(lblsubjName);
		addSubjPanel.add(txtSubjName);
		
		setLayout(new BorderLayout());
		add(titlePanel, BorderLayout.NORTH);
		add(addSubjPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
		
		jbtnAdd.addActionListener(new addSubjListener());	
	}
	
	private class addSubjListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(isValidData()) {
				JOptionPane.showMessageDialog(null, "Subjects added successfully", "Add subjects", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		private boolean isValidData() {
			// TODO Auto-generated method stub
			if(!Validator.isInteger(txtYear, "Subject Code")) return false;
			if(!Validator.isInteger(txtSemester, "Semester")) return false;
			if(!Validator.isPresent(txtSubjCode, "Subject Code")) return false;
			if(!Validator.isPresent(txtSubjName, "Subject Name")) return false;
			
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		addSubjects frame = new addSubjects();
		frame.setTitle("Add Subjects");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setVisible(true);
	}
}
