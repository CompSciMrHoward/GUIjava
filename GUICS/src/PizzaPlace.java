import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PizzaPlace implements ActionListener {
//new JComponants are declared here, i.e. JButtons in PD
	
	public static void main(String[] args) {
		new PizzaPlace();
	}
	public PizzaPlace() {
		JFrame myFrame = new JFrame("Practice");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
	}

}
