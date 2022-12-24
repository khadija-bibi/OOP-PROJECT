package oopProject;

import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public  class Menu  {
	 Menu() {
		// TODO Auto-generated constructor stub

//			making objects for each component
		 JFrame frame2 = new JFrame();

		JTextField items = new JTextField();
		JTextField drinks = new JTextField();
		JTextField coffee = new JTextField();
		JTextField itemQuantity = new JTextField();
		JTextField drinksQuantity = new JTextField();
		JTextField coffeeQuantity = new JTextField();
		JLabel l1 = new JLabel("ITEMS");
		JLabel l2 = new JLabel("DRINKS");
		JLabel l3 = new JLabel("COFFEE");
		JLabel l4 = new JLabel("Qty");
		JLabel l5 = new JLabel("Qty");
		JLabel l6 = new JLabel("Qty");
		JLabel l7 = new JLabel("MENU");
		JButton calculateBtn = new JButton("Calculate\n Bill");
		JButton clearBtn = new JButton("Clear");
//		     setting bounds
		items.setBounds(130, 100, 120, 40);
		drinks.setBounds(450, 100, 120, 40);
		coffee.setBounds(770, 100, 120, 40);
		itemQuantity.setBounds(130, 200, 120, 40);
		drinksQuantity.setBounds(450, 200, 120, 40);
		coffeeQuantity.setBounds(770, 200, 120, 40);
		l1.setBounds(60, 100, 200, 40);
		l2.setBounds(370, 100, 200, 40);
		l3.setBounds(680, 100, 200, 40);
		l4.setBounds(60, 200, 200, 40);
		l5.setBounds(370, 200, 200, 40);
		l6.setBounds(680, 200, 200, 40);
		l7.setBounds(90, 42, 120, 40);
		calculateBtn.setBounds(320, 350, 130, 40);
		clearBtn.setBounds(550, 350, 130, 40);
//				adding components
		frame2.add(items);
		frame2.add(drinks);
		frame2.add(coffee);
		frame2.add(itemQuantity);
		frame2.add(drinksQuantity);
		frame2.add(coffeeQuantity);
		frame2.add(l1);
		frame2.add(l2);
		frame2.add(l3);
		frame2.add(l4);
		frame2.add(l5);
		frame2.add(l6);
		frame2.add(l7);

		frame2.add(calculateBtn);
		frame2.add(clearBtn);
		frame2.setSize(1000, 600);
		frame2.setLayout(null);
		frame2.setVisible(true);
//				setting font
		l1.setFont(new Font(null, 0, 20));
		l2.setFont(new Font(null, 0, 20));
		l3.setFont(new Font(null, 0, 20));
		l4.setFont(new Font(null, 0, 20));
		l5.setFont(new Font(null, 0, 20));
		l6.setFont(new Font(null, 0, 20));
		l7.setFont(new Font(null, 0, 30));
//              clear button functionality
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				items.setText(null);
				drinks.setText(null);
				coffee.setText(null);
				itemQuantity.setText(null);
				drinksQuantity.setText(null);
				coffeeQuantity.setText(null);
			}

		});
//				calculate button functionality
		calculateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				
			}

		});
//		item drop menu
		items.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
//		drinks drop menu
//		coffee drop menu

	}

}
