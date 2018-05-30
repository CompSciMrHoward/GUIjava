import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorChooser implements ActionListener{
JButton button;//state variable, 
//MUST DELETE datatype in constructor
public static void main(String[] args) {
	new ColorChooser();
}//end of main
public ColorChooser() {
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new FlowLayout());
	
	button = new JButton("Pick Color");
	//connects button to ActionListener
	button.addActionListener(this);
	//alt + parameter clicks the button
	//accessiblity option
	button.setMnemonic('p');
	f.add(button);
	f.pack();
	
}//end of constructor
@Override
public void actionPerformed(ActionEvent e) {
	//when button pressed, this code runs
	Color background = button.getBackground();
	Color c = JColorChooser.showDialog(null, "Pick a color", background);
	if(background != null) {
		button.setBackground(c);
	}
}
}//end of class
