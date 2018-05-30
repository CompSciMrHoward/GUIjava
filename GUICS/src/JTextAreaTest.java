import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JTextAreaTest implements ActionListener {
//new JComponants are declared here, i.e. JButtons in PD
JTextArea myTextArea;	
	public static void main(String[] args) {
		new JTextAreaTest();
	}
	public JTextAreaTest() {
		JFrame myFrame = new JFrame("TextArea");
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new FlowLayout());
		myTextArea = new JTextArea("Type here!", 5, 20);
		myTextArea.setLineWrap(true);
		JScrollPane myScrollPane = new JScrollPane(myTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		String[] us = {"me", "you", "them"};
		JList list = new JList<>(us);
		list.setVisibleRowCount(2);
		myFrame.add(list);
		
		myFrame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
	}

}
