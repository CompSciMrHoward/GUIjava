import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ComponentTest implements ActionListener {
//new JComponants are declared here, i.e. JButtons in PD
	public static void main(String[] args) {
		new ComponentTest();
	}
	public ComponentTest() {
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
