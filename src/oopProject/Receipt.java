package oopProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Receipt {
	public Receipt() {
		// TODO Auto-generated constructor stub

//		making objects for each component
		JFrame frame4 = new JFrame();
		JPanel panel = new JPanel();
		JLabel titleLabel = new JLabel("The Food Villa");
//		JLabel addLabel = new JLabel("Address:");
//		JLabel phoneLabel = new JLabel("Telephone Number:");
//		JLabel addDesLabel = new JLabel("NUML Islamabad Cafe");
//		JLabel phoneDesLabel = new JLabel("03001234567");
//		JLabel receiptLabel = new JLabel("CASH RECEIPT");
//		JLabel desLabel = new JLabel("Description");
//		JLabel receiptQtyLabel = new JLabel("Qty");
//		JLabel receiptPriceLabel = new JLabel("Price");
//		JLabel totalLabel = new JLabel("TOTAL");
//		JLabel finalTotalLabel = new JLabel("3000");
//		JLabel thankLabel = new JLabel("THANK YOU");
//		JLabel dateLabel = new JLabel("25/12/2022");
//		JLabel timeLabel = new JLabel("3:00 PM");

//	panel		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		panel.setBorder(blackline);
		panel.setBackground(Color.white);

//		setting bounds
		panel.setBounds(300, 40, 400, 485);
//		titleLabel.setBounds(0, 0, 0, 0);
//		addLabel.setBounds(300, 40, 100, 40);
//		phoneLabel.setBounds(300, 40, 400, 485);
//		addDesLabel.setBounds(300, 40, 400, 485);
//		phoneDesLabel.setBounds(300, 40, 400, 485);
//		receiptLabel.setBounds(300, 40, 400, 485);
//		desLabel.setBounds(300, 40, 400, 485);
//		receiptQtyLabel.setBounds(300, 40, 400, 485);
//		receiptPriceLabel.setBounds(300, 40, 400, 485);
//		totalLabel.setBounds(300, 40, 400, 485);
//		finalTotalLabel.setBounds(300, 40, 400, 485);
//		thankLabel.setBounds(300, 40, 400, 485);
//		dateLabel.setBounds(300, 40, 400, 485);
//		timeLabel.setBounds(300, 40, 400, 485);
//		setting fonts

//      adding components
		frame4.add(panel);

		panel.add(titleLabel);
//		panel.add(addLabel);
//		panel.add(phoneLabel);
//		panel.add(addDesLabel);
//		panel.add(phoneDesLabel);
//		panel.add(receiptLabel);
//		panel.add(desLabel);
//		panel.add(receiptQtyLabel);
//		panel.add(receiptPriceLabel);
//		panel.add(totalLabel);
//		panel.add(finalTotalLabel);
//		panel.add(thankLabel);
//		panel.add(dateLabel);
//		panel.add(timeLabel);

		frame4.setSize(1000, 600);
		frame4.setLayout(null);
		frame4.setVisible(true);
		panel.setLayout(null);
		panel.setVisible(true);
	};

}
