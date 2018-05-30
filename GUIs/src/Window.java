import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Window implements ActionListener {
	JLabel label;
	JTextField text;
	JButton button1, button2;
	
	public static void main(String[] args) {
		new Window();
	}
	public Window() {
		JFrame myFrame = new JFrame("First Window");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//FlowLayout layout = new FlowLayout();
		myFrame.setLayout(new FlowLayout());
		
		////two parts
		//create components
		//add to JFrame
		label = new JLabel("Type your name");
		//label.setText("");
		myFrame.add(label);
		text = new JTextField("...", 15);
		myFrame.add(text);
		
		button1 = new JButton("Click Me");
		button1.setMnemonic(KeyEvent.VK_1);
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.WHITE);
		button1.addActionListener(this);
		myFrame.add(button1);
		
		button2 = new JButton("Click Me 2");
		Color mystery = new Color(25, 51, 9);
		button2.setBackground(mystery);
		button2.addActionListener(this);
		myFrame.add(button2);
		
		myFrame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == button1) {
		JOptionPane.showMessageDialog(null, "You pressed button 1", "Button 1 Press", JOptionPane.WARNING_MESSAGE);
		}
		else if(source == button2) {
			JOptionPane.showMessageDialog(null, "You pressed button 2");
		}
		
	}

}
