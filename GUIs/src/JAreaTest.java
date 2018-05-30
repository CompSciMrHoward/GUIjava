import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class JAreaTest implements ActionListener {
	JButton b1, b2, b3;

	public static void main(String[] args) {
		JAreaTest window = new JAreaTest("1", "2", "3");
	}

	
	public JAreaTest(String text1, String text2, String text3) {
		b1 = new JButton(text1);
		b1.setMnemonic(KeyEvent.VK_1);
		b1.addActionListener(this);
		b1.setToolTipText("Click to disable 2");
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.YELLOW);
		
		b2 = new JButton(text2);
		b2.setMnemonic(KeyEvent.VK_2);
		b2.addActionListener(this);
		b2.setBackground(Color.RED);
		b2.setForeground(Color.BLUE);
		
		b3 = new JButton(text3);
		b3.setMnemonic(KeyEvent.VK_3);
		b3.addActionListener(this);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);

		JFrame mainFrame = new JFrame("Actions");
		mainFrame.setSize(500, 300);
		mainFrame.setLayout(new FlowLayout());
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(b1);
		mainFrame.add(b2);
		mainFrame.add(b3);
		mainFrame.pack();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == b1) {
			JOptionPane.showMessageDialog(null, "Clicked 1, 2 disabled", "Button 1", JOptionPane.ERROR_MESSAGE);
			b2.setEnabled(false);
		}
		else if(source == b2) {
			JOptionPane.showMessageDialog(null, "Clicked 2");
			
		}
		else if(source == b3) {
			JOptionPane.showMessageDialog(null, "3 clicked, 2 enabled", "Button 3", JOptionPane.WARNING_MESSAGE);
			b2.setEnabled(true);

		}
		
	}
	

}
