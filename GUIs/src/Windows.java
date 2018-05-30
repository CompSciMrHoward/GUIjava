import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Windows implements ActionListener{

	JButton button1, button2;
	
	public static void main(String[] args) {
		new Windows();
		
		System.out.println((int)'1');
	}
	public Windows() {
		JFrame myFrame = new JFrame("My First Window");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		
		//two parts
			//create components
			//add to JFrame
		JLabel label = new JLabel("Enter your name");
		myFrame.add(label);
		JTextField text = new JTextField("Name", 10);
		text.setFont(new Font("Colibri", Font.PLAIN, 14));
		myFrame.add(text);
		button1 = new JButton("Click me!");
		button1.setBackground(Color.GRAY);
		//button color
		button1.setForeground(Color.WHITE);
		//text color
		button1.setMnemonic(KeyEvent.VK_1);
		button1.addActionListener(this);
		myFrame.add(button1);	
		
		button2 = new JButton("Click me 2!");
		Color mystery = new Color(24, 5, 23);
		button2.setBackground(mystery);
		button2.addActionListener(this);
		myFrame.add(button2);	
		
		
		myFrame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button1) {
		JOptionPane.showMessageDialog(null, "You clicked button 1", "title", JOptionPane.ERROR_MESSAGE);
		
		}
		else if(source == button2) {
			JOptionPane.showMessageDialog(null, "You clicked button 2");
		}
		
		
	}

}
