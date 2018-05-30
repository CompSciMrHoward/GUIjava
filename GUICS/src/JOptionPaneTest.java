import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JOptionPaneTest implements ActionListener {
//new JComponants are declared here, i.e. JButtons in PD
	
	public static void main(String[] args) {
		String result = JOptionPane.showInputDialog(null,"What's your Name?", "Jane", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Hello " + result, "Result", JOptionPane.QUESTION_MESSAGE);
		
		
		
		
		
		
	}
	public JOptionPaneTest() {
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
