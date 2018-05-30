import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIretest20Pts implements ActionListener{
	JButton b1;
	public static void main(String[] args) {
		new GUIretest20Pts();
	}
	
	public GUIretest20Pts() {
	JFrame frame = new JFrame("20 Point Window");
	//creates window
	JPanel mainPanel = (JPanel)frame.getContentPane();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainPanel.setLayout(new BorderLayout());
	mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	
	mainPanel.add(new JLabel("This Spinner starts @ 0 and has a range from 0 to 9"), BorderLayout.PAGE_START);
	mainPanel.add(new JLabel("Counts by 2 "), BorderLayout.LINE_START);
	mainPanel.add(new JSpinner(new SpinnerNumberModel(0, 0, 9, 2)), BorderLayout.CENTER);
	mainPanel.add(new JButton("Select"), BorderLayout.LINE_END);
	mainPanel.add(new JCheckBox("I want 20 Points!"), BorderLayout.PAGE_END);

	
	


	frame.setVisible(true);
	//frame.setSize(200, 100);
	frame.pack();

	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
	}}
