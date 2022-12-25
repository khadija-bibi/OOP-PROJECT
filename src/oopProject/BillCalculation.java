package oopProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BillCalculation {
	public BillCalculation() {
		// TODO Auto-generated constructor stub

//	making objects for each component
		JFrame frame3 = new JFrame();
		JLabel billCalLabel = new JLabel("BILL CALCULATION");
		JLabel itemsLabel = new JLabel("Items");
		JLabel qtyLabel = new JLabel("Qty");
		JLabel priceLabel = new JLabel("Price");
		JLabel totalLabel = new JLabel("Total");
		JLabel gTLabel = new JLabel("G.Total");
		JLabel customerLabel = new JLabel("Customer");
		JLabel returnLabel = new JLabel("Return");
		JLabel itemSelLabel = new JLabel("ITEM SELECTED");

		JTextField gTotalTf = new JTextField();
		JTextField customerTf = new JTextField();
		JTextField retTf = new JTextField();
		JButton button = new JButton("Get Receipt");
//      list
		DefaultListModel<String> calItemList = new DefaultListModel<>();
		JList<String> listitem = new JList<>(calItemList);

		DefaultListModel<String> calQtyList = new DefaultListModel<>();
		JList<String> listQty = new JList<>(calQtyList);

		DefaultListModel<String> calPriceList = new DefaultListModel<>();
		JList<String> listPrice = new JList<>(calPriceList);

		DefaultListModel<String> totalPriceList = new DefaultListModel<>();
		JList<String> listTotalPrice = new JList<>(calPriceList);

//	setting bounds
		billCalLabel.setBounds(350, 40, 500, 50);
		itemSelLabel.setBounds(380, 90, 500, 50);
		itemsLabel.setBounds(290, 150, 500, 50);
		qtyLabel.setBounds(450, 150, 500, 50);
		priceLabel.setBounds(520, 150, 500, 50);
		totalLabel.setBounds(600, 150, 500, 50);
		returnLabel.setBounds(390, 420, 500, 50);
		customerLabel.setBounds(190, 420, 500, 50);
		retTf.setBounds(170, 470, 130, 35);
		customerTf.setBounds(380, 470, 130, 35);
		gTLabel.setBounds(620, 420, 500, 50);
		gTotalTf.setBounds(710, 430, 130, 35);
		listitem.setBounds(270, 210, 180, 200);
		listQty.setBounds(450, 210, 50, 200);
		listPrice.setBounds(490, 210, 80, 200);
		listTotalPrice.setBounds(570, 210, 100, 200);
		button.setBounds(710, 480, 120, 40);

//	setting fonts
		billCalLabel.setFont(new Font(null, 0, 30));
		itemSelLabel.setFont(new Font(null, 0, 25));
		itemsLabel.setFont(new Font(null, 0, 23));
		qtyLabel.setFont(new Font(null, 0, 23));
		priceLabel.setFont(new Font(null, 0, 23));
		totalLabel.setFont(new Font(null, 0, 23));
		returnLabel.setFont(new Font(null, 0, 23));
		customerLabel.setFont(new Font(null, 0, 23));
		gTLabel.setFont(new Font(null, 0, 23));

		// adding components

		frame3.add(billCalLabel);
		frame3.add(itemSelLabel);
		frame3.add(itemsLabel);
		frame3.add(qtyLabel);
		frame3.add(priceLabel);
		frame3.add(totalLabel);
		frame3.add(gTLabel);
		frame3.add(customerLabel);
		frame3.add(returnLabel);
		frame3.add(itemSelLabel);
		frame3.add(gTotalTf);
		frame3.add(customerTf);
		frame3.add(retTf);
		frame3.add(listitem);
		frame3.add(listQty);
		frame3.add(listPrice);
		frame3.add(listTotalPrice);
		frame3.add(button);

		frame3.setSize(1000, 600);
		frame3.setLayout(null);
		frame3.setVisible(true);
//		getting receipt
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new oopProject.Receipt();
				frame3.dispose();
			}
		});

	};

}
