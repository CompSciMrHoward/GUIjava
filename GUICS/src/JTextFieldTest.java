import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class JTextFieldTest implements ActionListener {
	JTextField userText = null;
	JButton button1;
	
	public static void main(String[] args) {
		new JTextFieldTest();
	}

	
	public JTextFieldTest() {
		
		JFrame myFrame = new JFrame();
		myFrame.setLayout(new FlowLayout());
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = (JPanel)myFrame.getContentPane();
		mainPanel.add(new JLabel("Enter your name:"));
		userText = new JTextField("My Name is Earl", 30);
		mainPanel.add(userText);
		userText.addActionListener(this);
		button1 = new JButton("Submit");
		mainPanel.add(button1);
		button1.addActionListener(this);
		myFrame.pack();	

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		//submit text when enter is pressed
		if(source == userText) {
		String text = "Hello " +userText.getText();
		JOptionPane.showMessageDialog(null, text);
		}
		}
		
	}
	


