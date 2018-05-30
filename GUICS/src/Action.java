import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Action implements ActionListener{

	JButton button1, button2;

public static void main(String[] args) {
	new Action();
}//end of Main Method
public Action() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setLayout(new FlowLayout());
	
	button1 = new JButton("1");
	button1.addActionListener(this);
	button1.setMnemonic('1');
	frame.add(button1);
	
	button2 = new JButton("2");
	button2.addActionListener(this);
	frame.add(button2);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	Object source = e.getSource();
	if(source == button1) {
	JOptionPane.showMessageDialog(null, "Clicked 1");
	Color mystery = new Color(45, 68, 123);
	button2.setBackground(mystery);
	}
	else if(source == button2) {
		JOptionPane.showMessageDialog(null, "Clicked 2");
	}
}



}
