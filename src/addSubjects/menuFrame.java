package addSubjects;


import java.awt.event.KeyEvent;

import javax.swing.*;



public class menuFrame extends JFrame {
	private JMenuBar mBar;
	private JMenu mHome;
	private JMenu mAdmin;
	private JMenu mFaculty;
	private JMenu mStudent;
	private JMenu mContact;
	private JDesktopPane desktop;
	
	public menuFrame() {
		this.initialize();
		this.setTitle("Project");
		this.setSize(400,300);
		
		
	}
	

	private void initialize() {
		mBar=new JMenuBar();
		desktop=new JDesktopPane();
		this.setContentPane(desktop);
		
		mHome =new JMenu("Home");
		mHome.setMnemonic(KeyEvent.VK_H);
		
		
		mAdmin=new JMenu("Admin");
		mAdmin.setMnemonic(KeyEvent.VK_A);
		
		mFaculty=new JMenu("Faculty");
		mFaculty.setMnemonic(KeyEvent.VK_F);
		
		mStudent=new JMenu("Student");
		mStudent.setMnemonic(KeyEvent.VK_S);
		
		mContact=new JMenu("Contact");
		mContact.setMnemonic(KeyEvent.VK_C);
			

	    mBar.add(mHome);
	    mBar.add(mAdmin);
	    mBar.add(mFaculty);
	    mBar.add(mStudent);
	    mBar.add(mContact);
	    
	    this.setJMenuBar(mBar);
	}

	
		
		public static void main(String[] args) {
			menuFrame mainframe = new menuFrame();
			mainframe.setVisible(true);
			mainframe.setSize(600,600);
		}
	
		

}
