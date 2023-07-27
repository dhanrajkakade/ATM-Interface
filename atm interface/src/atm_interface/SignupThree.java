package atm_interface;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
	
	JRadioButton savingac, fixedac, currentac, recurringac;
	JCheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
	JButton submit, cancel; 
	String formno;
	
	SignupThree(String formno) {
		this.formno = formno;
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("Raleway", Font.BOLD, 22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		savingac = new JRadioButton("Saving Account");
		savingac.setFont(new Font("Raleway", Font.BOLD, 16));
		savingac.setBackground(Color.WHITE);
		savingac.setBounds(100, 180, 150, 20);
		add(savingac);
		
		fixedac = new JRadioButton("Fixed Deposit Account");
		fixedac.setFont(new Font("Raleway", Font.BOLD, 16));
		fixedac.setBackground(Color.WHITE);
		fixedac.setBounds(350, 180, 250, 20);
		add(fixedac);
		
		currentac = new JRadioButton("Current Account");
		currentac.setFont(new Font("Raleway", Font.BOLD, 16));
		currentac.setBackground(Color.WHITE);
		currentac.setBounds(100, 220, 250, 20);
		add(currentac);
		
		recurringac = new JRadioButton("Recurring Deposit Account");
		recurringac.setFont(new Font("Raleway", Font.BOLD, 16));
		recurringac.setBackground(Color.WHITE);
		recurringac.setBounds(350, 220, 250, 20);
		add(recurringac);
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(savingac);
		groupaccount.add(fixedac);
		groupaccount.add(currentac);
		groupaccount.add(recurringac);
		
		JLabel card= new JLabel("Card Number:");
		card.setFont(new Font("Raleway", Font.BOLD, 22));
		card.setBounds(100, 300, 200, 30);
		add(card);
		
		JLabel number= new JLabel("XXXX-XXXX-XXXX-2129");
		number.setFont(new Font("Raleway", Font.BOLD, 22));
		number.setBounds(330, 300, 300, 30);
		add(number);
		
		JLabel carddetail= new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
		carddetail.setBounds(100, 330, 300, 20);
		add(carddetail);
		
		JLabel pin= new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 22));
		pin.setBounds(100, 370, 200, 30);
		add(pin);
		
		JLabel pindetail= new JLabel("Your 4 Digit PIN");
		pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
		pindetail.setBounds(100, 400, 300, 20);
		add(pindetail);
		
		JLabel pnumber= new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
		pnumber.setBounds(330, 370, 300, 30);
		add(pnumber);
		
		JLabel services= new JLabel("Services Required:");
		services.setFont(new Font("Raleway", Font.BOLD, 22));
		services.setBounds(100, 450, 400, 30);
		add(services);
		
		cb1 = new JCheckBox("ATM CARD");
		cb1.setBackground(Color.WHITE);
		cb1.setFont(new Font("Raleway", Font.BOLD, 16));
		cb1.setBounds(100, 500, 200, 30);
		add(cb1);
		
		cb2 = new JCheckBox("Internet Banking");
		cb2.setBackground(Color.WHITE);
		cb2.setFont(new Font("Raleway", Font.BOLD, 16));
		cb2.setBounds(350, 500, 200, 30);
		add(cb2);
		
		cb3 = new JCheckBox("Mobile Banking");
		cb3.setBackground(Color.WHITE);
		cb3.setFont(new Font("Raleway", Font.BOLD, 16));
		cb3.setBounds(100, 550, 200, 30);
		add(cb3);
		
		cb4 = new JCheckBox("EMAIL & SMS Alerts");
		cb4.setBackground(Color.WHITE);
		cb4.setFont(new Font("Raleway", Font.BOLD, 16));
		cb4.setBounds(350, 550, 200, 30);
		add(cb4);
		
		cb5 = new JCheckBox("Cheque Book");
		cb5.setBackground(Color.WHITE);
		cb5.setFont(new Font("Raleway", Font.BOLD, 16));
		cb5.setBounds(100, 600, 200, 30);
		add(cb5);
		
		cb6 = new JCheckBox("E-Statement");
		cb6.setBackground(Color.WHITE);
		cb6.setFont(new Font("Raleway", Font.BOLD, 16));
		cb6.setBounds(350, 600, 200, 30);
		add(cb6);
		
		cb7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		cb7.setBackground(Color.WHITE);
		cb7.setFont(new Font("Raleway", Font.BOLD, 16));
		cb7.setBounds(100, 680, 1000, 30);
		add(cb7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(250, 720, 100, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBounds(420, 720, 100, 30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == submit) {
			String accountType = null;
			if (savingac.isSelected()) {
				accountType = "Saving Account";
			} else if (fixedac.isSelected()) {
				accountType = "Fixed Deposit Account";
			} else if (currentac.isSelected()) {
				accountType = "Current Account";
			} else if (recurringac.isSelected()) {
				accountType = "Recurring Deposit Account";
			}
			
			Random random = new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 2127293100000000L);
			
			String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
			
			String facility = "";
			if (cb1.isSelected()) {
				facility = facility + " ATM Card";
			} else if (cb2.isSelected()) {
				facility = facility + " Internet Banking";
			} else if (cb3.isSelected()) {
				facility = facility + " Mobile Banking";
			} else if (cb4.isSelected()) {
				facility = facility + " EMAIL & SMS Alerts";
			} else if (cb5.isSelected()) {
				facility = facility + " Cheque Book";
			} else if (cb6.isSelected()) {
				facility = facility + " E-Statement ";
			} 
			
			try {
				if (accountType.equals("")) {
					JOptionPane.showMessageDialog(null, "Account Type is Required");
				} else {
					Conn conn = new Conn();
					String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
					String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);

					JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
					
					setVisible(false);
					new Deposit(pinnumber).setVisible(false);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
				
		} else if (ae.getSource() == cancel) {
			setVisible(false);
			new Login().setVisible(true);
			
		}
	}
	
	public static void main(String args[]) {
		new SignupThree("");
	}

}
