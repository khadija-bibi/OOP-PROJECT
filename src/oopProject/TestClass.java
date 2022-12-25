package oopProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TestClass {
public TestClass() {
	// TODO Auto-generated constructor stub

	JFrame frame2 = new JFrame();
	JPanel panel =new JPanel();
	Border blackline = BorderFactory.createLineBorder(Color.black);
	panel.setBorder(blackline);
	panel.setBackground(Color.white);

//	setting bounds
	panel.setBounds(300, 40, 400, 485);

//	making objects for each component
	

	JLabel l1 = new JLabel("ITEMS");
	

	


//	     setting bounds
	
	
//	l1.setBounds(60, 100, 200, 40);
	
	
	
//			adding components
	
	frame2.add(panel);
	
	panel.add(l1);
	

	frame2.setSize(1000, 600);
	frame2.setLayout(null);
	frame2.setVisible(true);
//			setting font
	

}
}
