import javax.swing.*;
import java.awt.*;

public class FirstWindow {

	public static void main(String[] args) {
	JFrame myFrame = new JFrame("My First Window");
	//sets a flow layout
	myFrame.setLayout(new FlowLayout());
	//must have these two method calls
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setVisible(true);
	//myFrame.setTitle("My First Window");
	
	//two steps
		//create components
		//add to JFrame
	JLabel label = new JLabel("Enter your name here");
	myFrame.add(label);
	//int as parameter, width in columns of text box
	JTextField text = new JTextField("Type here", 15);
	myFrame.add(text);
	
	JButton b1 = new JButton();
	b1.setText("Click Me!");
	//sets button color
	b1.setBackground(Color.GRAY);
	b1.setForeground(Color.WHITE);
	myFrame.add(b1);
	
	myFrame.pack();
	
	}

}
