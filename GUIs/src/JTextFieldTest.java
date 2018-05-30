import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class JTextFieldTest implements ActionListener {
	JTextField userText = null;
	JButton submit;
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
		userText = new JTextField(5);
		mainPanel.add(userText);
		userText.addActionListener(this);
		
		submit = new JButton("Submit");
		mainPanel.add(submit);
		submit.addActionListener(this);
		myFrame.pack();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		//submit text when enter is pressed
		if(source == userText) {
			JOptionPane.showMessageDialog(null, "Text is " + userText.getText());
		}
		else if(source == submit) {
			String output = "Hello "+userText.getText();
			JOptionPane.showMessageDialog(null, output);

		}
		}
		
	}
	


