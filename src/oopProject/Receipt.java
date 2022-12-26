package oopProject;

import java.awt.Container;

import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import javax.swing.DefaultListModel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Receipt extends Menu  {
	 String stringTotalPrice;
	 JList<String>listItem;
	 JList<String>listQty;
	 JList<String>listTotalPrice;
	public Receipt(String stringTotalPrice,JList<String>listItem,JList<String>listQty,
			JList<String>listTotalPrice) {
		
		this.stringTotalPrice=stringTotalPrice;
		this.listItem=listItem;
		this.listQty=listQty;
		this.listTotalPrice=listTotalPrice;
		// TODO Auto-generated constructor stub
		 Date date = new Date();
	      SimpleDateFormat dateformatter = new SimpleDateFormat("dd/MM/yy");
	       String str = dateformatter.format(date);	
	       DateFormat timeformatter = new SimpleDateFormat("hh:mm:ss a");
	        String time = timeformatter.format(new Date());

//		making objects for each component
		JFrame frame4 = new JFrame();

		Container con = new Container();
		JLabel titleLabel = new JLabel("The Food Villa");
		JLabel addLabel = new JLabel("Address:");
		JLabel phoneLabel = new JLabel("Telephone Number:");
		JLabel addDesLabel = new JLabel("NUML Islamabad Cafe");
		JLabel phoneDesLabel = new JLabel("03001234567");
		JLabel receiptLabel = new JLabel("CASH RECEIPT");
		JLabel desLabel = new JLabel("Description");
		JLabel receiptQtyLabel = new JLabel("Qty");
		JLabel receiptPriceLabel = new JLabel("Price");
		JLabel totalLabel = new JLabel("TOTAL");
		JLabel finalTotalLabel = new JLabel(stringTotalPrice);
		JLabel thankLabel = new JLabel("THANK YOU");
		JLabel dateLabel = new JLabel(str);
		JLabel timeLabel = new JLabel(time);
//       lists

		
		JList<String> listrecDes =listItem;

	
		JList<String> listrecQty =listQty;

		
		JList<String> listrecPrice = listTotalPrice;

//		setting bounds
		titleLabel.setBounds(420, 30, 300, 50);
		addLabel.setBounds(380, 60, 80, 40);
		phoneLabel.setBounds(360, 80, 400, 40);
		addDesLabel.setBounds(450, 60, 200, 40);
		phoneDesLabel.setBounds(510, 80, 400, 40);
		receiptLabel.setBounds(420, 130, 400, 40);
		desLabel.setBounds(280, 160, 400, 40);
		receiptQtyLabel.setBounds(520, 160, 400, 40);
		receiptPriceLabel.setBounds(630, 160, 400, 40);
		totalLabel.setBounds(280, 380, 400, 40);
		finalTotalLabel.setBounds(630, 380, 400, 40);
		thankLabel.setBounds(420, 450, 400, 40);
		dateLabel.setBounds(280, 490, 400, 40);
		timeLabel.setBounds(630, 490, 400, 40);

		listrecDes.setBounds(280, 200, 220, 180);
		listrecQty.setBounds(500, 200, 100, 180);
		listrecPrice.setBounds(600, 200, 90, 180);

//		setting fonts
		titleLabel.setFont(new Font(null, Font.BOLD, 20));
		addLabel.setFont(new Font(null, Font.BOLD, 15));
		phoneLabel.setFont(new Font(null, Font.BOLD, 15));
		receiptLabel.setFont(new Font(null, Font.BOLD, 15));
		totalLabel.setFont(new Font(null, Font.BOLD, 15));
		finalTotalLabel.setFont(new Font(null, Font.BOLD, 15));
		phoneLabel.setFont(new Font(null, Font.BOLD, 15));
		receiptQtyLabel.setFont(new Font(null, Font.BOLD, 15));
		thankLabel.setFont(new Font(null, Font.BOLD, 20));
		finalTotalLabel.setFont(new Font(null, Font.BOLD, 15));
		desLabel.setFont(new Font(null, Font.BOLD, 15));
		receiptPriceLabel.setFont(new Font(null, Font.BOLD, 15));

//      adding components

		frame4.add(titleLabel);
		frame4.add(addLabel);
		frame4.add(phoneLabel);
		frame4.add(addDesLabel);
		frame4.add(phoneDesLabel);
		frame4.add(receiptLabel);
		frame4.add(desLabel);
		frame4.add(receiptQtyLabel);
		frame4.add(receiptPriceLabel);
		frame4.add(totalLabel);
		frame4.add(finalTotalLabel);
		frame4.add(thankLabel);
		frame4.add(dateLabel);
		frame4.add(timeLabel);
		frame4.add(listrecDes);
		frame4.add(listrecQty);
		frame4.add(listrecPrice);

		frame4.setSize(1000, 600);
		frame4.setLayout(null);
		frame4.setVisible(true);
		
	};

}
