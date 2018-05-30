import java.awt.*;

import javax.swing.*;

public class GUIretest5Pts {
	
	public static void main(String[] args) {
		new GUIretest5Pts();
	}
	
	public GUIretest5Pts() {
	JFrame frame = new JFrame("5 Point Window");
	//creates window
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	frame.setLayout(new FlowLayout());
	frame.add(new JLabel("Enter your Name:"));
	frame.add(new JTextField(20));
	frame.pack();
	frame.add(new JButton("Submit"));
	frame.add(new JButton("Clear"));
	

	
	
}}
