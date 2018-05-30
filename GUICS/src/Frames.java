import java.awt.*;
import javax.swing.*;
public class Frames {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First Window");
		//creates window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setLayout(new FlowLayout());
		//create component
		JLabel label = new JLabel("Type your name");
		//label.setText("Type your name");
		//add to JFrame
		frame.add(label);
		
		//int as 1st para, width in columns
		//String as 1st para == default text, int as 2nd para
		JTextField text = new JTextField("Type here", 15);
		frame.add(text);
		
		JButton b1 = new JButton();
		b1.setText("Click Me!");
		Color blue1 = new Color(45, 3, 23);
		b1.setBackground(blue1);
		b1.setForeground(Color.YELLOW);
		frame.add(b1);
		
		
		
		frame.pack();
		
	}

}
