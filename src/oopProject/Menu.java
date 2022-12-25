package oopProject;

import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;


public class Menu {
	Menu() {
		// TODO Auto-generated constructor stub

		JFrame frame2 = new JFrame();
//		Dropdowm Menu
		String itemsMenu[] = { "Select Item", "Biryani(110Rs)", "Spaghetti(100Rs)", "FrenchFries(100Rs)",
				"Brownies(70Rs)", "Burger(100Rs)", "Samosa(50Rs)", "Shwarma(150Rs)", "Chicken RollParatha(150Rs)",
				"White Sauce Pasta(100Rs)", "Med Pizza(1200Rs)" };
		String drinksMenu[] = { "Select Drink", "Mango Shake(110Rs)", "Strawberry Shake(110Rs)",
				"Chocolate Shake(110Rs)", "Orange Juice(110Rs)", "Coke(110Rs)", "Fanta(110Rs)", "7 up(110Rs)" };
		String coffeeMenu[] = { "Select Coffee", "Cappuccino(130Rs)", "Espresso(130Rs)", "Latte(130Rs)", "Mocca(130Rs)",
				"Mix Tea(60Rs)" };
//		making objects for each component
		JComboBox items = new JComboBox(itemsMenu);
		JComboBox drinks = new JComboBox(drinksMenu);
		JComboBox coffee = new JComboBox(coffeeMenu);
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
		JLabel l8 = new JLabel("Selected Items :");
		

		JButton calculateBtn = new JButton("Calculate\n Bill");
		JButton clearBtn = new JButton("Clear");
		JButton addBtn1 = new JButton("ADD");
		JButton addBtn2 = new JButton("ADD");
		JButton addBtn3 = new JButton("ADD");
//      list
		DefaultListModel<String> itemsList = new DefaultListModel<>();
		JList<String> list = new JList<>(itemsList);

//		     setting bounds
		items.setBounds(130, 105, 180, 30);
		drinks.setBounds(450, 105, 180, 30);
		coffee.setBounds(770, 105, 180, 30);
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
		l8.setBounds(130, 200, 300, 300);
		
		calculateBtn.setBounds(760, 420, 130, 40);
		clearBtn.setBounds(760, 350, 130, 40);
		addBtn1.setBounds(130, 250, 90, 30);
		addBtn2.setBounds(450, 250, 90, 30);
		addBtn3.setBounds(770, 250, 90, 30);
		list.setBounds(130, 380, 180, 150);
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
		frame2.add(l8);
		

		frame2.add(calculateBtn);
		frame2.add(clearBtn);
		frame2.add(addBtn1);
		frame2.add(addBtn1);
		frame2.add(addBtn2);
		frame2.add(addBtn3);

		frame2.add(list);

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
		l8.setFont(new Font(null, 0, 17));
//              clear button functionality
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				items.setSelectedIndex(0);
				drinks.setSelectedIndex(0);
				coffee.setSelectedIndex(0);
				itemQuantity.setText(null);
				drinksQuantity.setText(null);
				coffeeQuantity.setText(null);
				itemsList.clear();
			}

		});
//				calculate button functionality
		calculateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new oopProject.BillCalculation();
				frame2.dispose();
			}

		});
//		Add Items functionality
		addBtn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object getSelectedItems = items.getSelectedItem();
				String getQuantity = itemQuantity.getText();

				int intQuantity = Integer.parseInt(getQuantity);
				String SelectedItem = getSelectedItems + " " + getQuantity;
				itemsList.add(0, SelectedItem);

			}
		});
//		Add Drinks functionality
		addBtn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				 TODO Auto-generated method stub
				Object getSelectedDrinks = drinks.getSelectedItem();
				String getQuantity = drinksQuantity.getText();

				int intQuantity = Integer.parseInt(getQuantity);
				String SelectedItem = getSelectedDrinks + " " + getQuantity;
				itemsList.add(0, SelectedItem);

			}
		});
//		Add Coffee functionality
		addBtn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object getSelectedCoffee = coffee.getSelectedItem();
				String getQuantity = coffeeQuantity.getText();

				int intQuantity = Integer.parseInt(getQuantity);
				String SelectedItem = getSelectedCoffee + " " + getQuantity;
				itemsList.add(0, SelectedItem);

			}
		});

	}

}
