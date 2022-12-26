package oopProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JTextField;

public class BillCalculation extends Menu{
	
    JTextField gTotalTf ;
	 String stringTotalPrice;
	 JList<String>listItem;
	 JList<String>listQty;
	 JList<String>listPrice;
	 JList<String>listTotalPrice;

	public BillCalculation(String stringTotalPrice,JList<String>listItem,JList<String>listQty,JList<String>listPrice,
			JList<String>listTotalPrice) {
	this.stringTotalPrice=stringTotalPrice;
	this.listItem=listItem;
	this.listQty=listQty;
	this.listPrice=listPrice;
	this.listTotalPrice=listTotalPrice;


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
		JButton receiptBtn = new JButton("Get Receipt");
		JButton returnBtn = new JButton("Cal Return");
		
	    JTextField gTotalTf = new JTextField(stringTotalPrice);
		JTextField customerTf = new JTextField();
		
		JTextField retTf = new JTextField();
		
//      list
//		DefaultListModel<String> calItemList = new DefaultListModel<>();
		JList<String> listitem = listItem;

//		DefaultListModel<String> calQtyList = new DefaultListModel<>();
		JList<String> listQty1 =listQty ;

//		DefaultListModel<String> calPriceList = new DefaultListModel<>();
		JList<String> listPrice1 = listPrice;

//		DefaultListModel<String> totalPriceList = new DefaultListModel<>();
		JList<String> listTotalPrice1 =listTotalPrice;

//	setting bounds
		billCalLabel.setBounds(350, 40, 500, 50);
		itemSelLabel.setBounds(380, 90, 500, 50);
		itemsLabel.setBounds(290, 150, 500, 50);
		qtyLabel.setBounds(450, 150, 500, 50);
		priceLabel.setBounds(520, 150, 500, 50);
		totalLabel.setBounds(600, 150, 500, 50);
		returnLabel.setBounds(480, 420, 500, 50);
		customerLabel.setBounds(190, 420, 500, 50);
		retTf.setBounds(470, 470, 130, 35);
		customerTf.setBounds(170, 470, 130, 35);
		gTLabel.setBounds(620, 420, 500, 50);
		gTotalTf.setBounds(710, 430, 130, 35);
		listitem.setBounds(275, 210, 170, 200);
		listQty1.setBounds(445, 210, 60, 200);
		listPrice1.setBounds(505, 210, 80, 200);
		listTotalPrice1.setBounds(585, 210, 100, 200);
		receiptBtn.setBounds(710, 470, 120, 40);
		returnBtn.setBounds(330, 470, 110, 30);
		
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
		frame3.add(listQty1);
		frame3.add(listPrice1);
		frame3.add(listTotalPrice1);
		frame3.add(receiptBtn);
		frame3.add(returnBtn);

		frame3.setSize(1000, 600);
		frame3.setLayout(null);
		frame3.setVisible(true);
//		getting return
		returnBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				
				int intTotalPrice=Integer.parseInt(stringTotalPrice);
				String stringCustomer=customerTf.getText();
				int intCustomer=Integer.parseInt(stringCustomer);
				int intReturn=intCustomer-intTotalPrice;
				String stringReturn=Integer.toString(intReturn);
				retTf.setText(stringReturn);
//				
			}
		});
		
		
//		getting receipt
		receiptBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new oopProject.Receipt(stringTotalPrice,listItem,listQty,listTotalPrice);
				
				frame3.dispose();
			}
		});
		
		
		
		

	};

}
