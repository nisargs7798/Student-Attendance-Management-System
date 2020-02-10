package Admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import addSubjects.menuFrame;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AdminMenu extends menuFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
					frame.setVisible(true);
					frame.setTitle("Admin Menu");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminMenu = new JLabel("Admin Menu:");
		lblAdminMenu.setBounds(47, 23, 99, 14);
		contentPane.add(lblAdminMenu);
		
		JRadioButton rdbtnHome = new JRadioButton("Home");
		rdbtnHome.setBackground(new Color(154, 205, 50));
		rdbtnHome.setBounds(47, 67, 109, 23);
		contentPane.add(rdbtnHome);
		
		JRadioButton rdbtnAddFaculty = new JRadioButton("Add Faculty");
		rdbtnAddFaculty.setBackground(new Color(154, 205, 50));
		rdbtnAddFaculty.setBounds(47, 103, 109, 23);
		contentPane.add(rdbtnAddFaculty);
		
		JRadioButton rdbtnAddStudent = new JRadioButton("Add Student");
		rdbtnAddStudent.setBackground(new Color(154, 205, 50));
		rdbtnAddStudent.setBounds(47, 137, 109, 23);
		contentPane.add(rdbtnAddStudent);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add Subjects");
		rdbtnNewRadioButton.setBackground(new Color(154, 205, 50));
		rdbtnNewRadioButton.setBounds(47, 170, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnGo = new JButton("GO!!!");
		btnGo.setBackground(Color.ORANGE);
		btnGo.setBounds(240, 115, 89, 23);
		contentPane.add(btnGo);
	}
}
