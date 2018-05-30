import java.awt.*;

import javax.swing.*;

public class GUIretest10Pts {
	
	public static void main(String[] args) {
		new GUIretest10Pts();
	}
	
	public GUIretest10Pts() {
	JFrame frame = new JFrame("10 Point Window");
	//creates window
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	frame.setLayout(new GridLayout(3,2));
	frame.add(new JTextField("5"));
	frame.add(new JTextField("10"));
	frame.add(new JButton("ADD"));
	frame.add(new JButton("SUBTRACT"));
	frame.add(new JButton("MULTIPLY"));
	frame.add(new JButton("DIVIDE"));
	
	frame.pack();

	
	
}}
