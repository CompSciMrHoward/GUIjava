import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JColorChoose implements ActionListener{
JButton color;	
public static void main(String[] args) {
	new JColorChoose();
	
}//end of main
public JColorChoose() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout());
	
	color = new JButton("Change color");
	color.addActionListener(this);
	frame.setSize(300, 100);
	frame.add(color);
	frame.pack();
}//end of constructor
@Override
public void actionPerformed(ActionEvent e) {
	Color background = color.getBackground();
	Color c = JColorChooser.showDialog(null, "Choose a new Color", background);
	if(background != null) {
		color.setBackground(c);
	}
}

}//end of class
