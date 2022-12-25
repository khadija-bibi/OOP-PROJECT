package oopProject;

import java.awt.Font;

import java.awt.Menu;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


import java.awt.event.*;

public class Credentials  {

	 Credentials() {
		// TODO Auto-generated constructor stub

//		making objects for each component
		JFrame frame1 = new JFrame("THE FOOD VILLA");
		final JLabel confirmationMsg = new JLabel();
		JLabel l1 = new JLabel("Username:");
		JLabel l2 = new JLabel("Password:");
		JLabel l3 = new JLabel("THE HOUSE VILLA ");
		
		final JTextField username = new JTextField();
		final JPasswordField password = new JPasswordField();
		JButton button = new JButton("Login");
		

//		setting bounds
		l3.setBounds(350, 50, 500, 50);
		l1.setBounds(310, 220, 300, 30);
		l2.setBounds(310, 300, 300, 30);
		username.setBounds(450, 215, 200, 40);
		password.setBounds(450, 295, 200, 40);
		button.setBounds(430, 400, 100, 40);
		confirmationMsg.setBounds(430, 470, 200, 50);
		
//		setting fonts
		l3.setFont(new Font(null, 0, 30));
		l1.setFont(new Font(null, 0, 20));
		l2.setFont(new Font(null, 0, 20));

//		adding components

		frame1.add(l1);
		frame1.add(l2);
		frame1.add(l3);
		frame1.add(username);
		frame1.add(password);
		frame1.add(button);
		frame1.add(confirmationMsg);
		frame1.setSize(1000, 600);
		frame1.setLayout(null);
		frame1.setVisible(true);
//		authorization
	button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String issuedUsername = username.getText();
				String issuedPassword = new String(password.getPassword());
				String settedUsername = "khadija";
				String settedPassword = "123";

				if (issuedUsername.equals(settedUsername) && issuedPassword.equals(settedPassword)) {
                    new oopProject.Menu();
                    frame1.dispose();
					
				} else
					confirmationMsg.setText("Invalid Username or Password");
		
	}
		});
//		
		};
	}


