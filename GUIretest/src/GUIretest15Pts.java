import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIretest15Pts implements ActionListener{
	JRadioButton r1, r2, r3;
	JButton b1;
	public static void main(String[] args) {
		new GUIretest15Pts();
	}
	
	public GUIretest15Pts() {
	JFrame frame = new JFrame("10 Point Window");
	//creates window
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel mainPanel = (JPanel)frame.getContentPane();
	mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

	mainPanel.add(new JLabel("Are you tall?"));
	
	r1 = new JRadioButton("Yes");
	r2 = new JRadioButton("Maybe");
	r3 = new JRadioButton("No");
	frame.add(r1);
	frame.add(r2);
	frame.add(r3);

	ButtonGroup sizeGroup = new ButtonGroup();
	sizeGroup.add(r1);
	sizeGroup.add(r2);
	sizeGroup.add(r3);
	
	b1 = new JButton("Submit");
	b1.addActionListener(this);
	mainPanel.add(b1);
	frame.setVisible(true);
	frame.pack();

	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == b1) {
			String message = "You picked : ";
			if(r1.isSelected()) {
				message += r1.getText();
			}
			if(r2.isSelected()) {
				message += r2.getText();
			}
			if(r3.isSelected()) {
				message += r3.getText();
			}
			JOptionPane.showMessageDialog(null, message);
		}
	}}
