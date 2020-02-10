package login;

import java.awt.BorderLayout;
import validator.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import addSubjects.menuFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class LoginPage extends menuFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(47, 78, 104, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(47, 117, 62, 21);
		contentPane.add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setBackground(Color.WHITE);
		textUsername.setBounds(133, 82, 96, 20);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isValidData()) {
					JOptionPane.showMessageDialog(null, "Login successful", "Add subjects", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(62, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		textPassword = new JTextField();
		textPassword.setBounds(133, 117, 96, 20);
		contentPane.add(textPassword);
		textPassword.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SignUp");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(179, 176, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblLoginPage = new JLabel("Login Page");
		lblLoginPage.setBackground(new Color(250, 240, 230));
		lblLoginPage.setBounds(47, 29, 89, 28);
		contentPane.add(lblLoginPage);
	}
	private boolean isValidData() {
		// TODO Auto-generated method stub
		if(!Validator.isPresent(textUsername, "Username")) return false;
		if(!Validator.isPresent(textPassword, "Password")) return false;
		
		
		return true;
	}
}
