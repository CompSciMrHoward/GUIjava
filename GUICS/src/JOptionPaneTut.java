import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JOptionPaneTut implements ActionListener {
//new JComponants are declared here, i.e. JButtons in PD
	public static void main(String[] args) {
		
	String result = JOptionPane.showInputDialog(null, "Enter your favorite color", "Red", JOptionPane.QUESTION_MESSAGE);	
	
	JOptionPane.showMessageDialog(null, "You entered " + result, "Your Color", JOptionPane.WARNING_MESSAGE );
		
		
		
		
		
		
		
	}
	public JOptionPaneTut() {
		JFrame myFrame = new JFrame("Practice");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		//Anonymous class
		myFrame.pack();
		//myFrame.setSize(400, 200); w, h
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
	}

}
