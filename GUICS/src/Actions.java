import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Actions implements ActionListener{
JButton button1, button2;
	public Actions() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		button1 = new JButton("1");
		//add actionListener
		button1.addActionListener(this);
		Color mystery = new Color(2, 5, 45);
		button1.setBackground(mystery);
		frame.add(button1);
		
		button2 = new JButton("2");
		//add actionListener
		button2.addActionListener(this);
		frame.add(button2);
		
		frame.pack();
	}
	public static void main(String[] args) {
		//move all code to constructor
		new Actions();
		//call constructor
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == button1) {
		JOptionPane.showMessageDialog(null, "Clicked button 1");
		//button2.setEnabled(false);
		}
		if(source == button2) {
			JOptionPane.showMessageDialog(null, "Clicked button 2");
			}
		
	}

}
