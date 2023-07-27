package atm_interface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField pan, aadhar;
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	JComboBox religion, category, occupation, education, income;
	String formno;
	
	SignupTwo(String formno) {
		this.formno = formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel religion1 = new JLabel("Religion:");
		religion1.setFont(new Font("Raleway", Font.BOLD, 20));
		religion1.setBounds(100, 140, 100, 30);
		add(religion1);
		
		String valReligion[] = {"Hindu", "Sikh", "Christian", "Other"};
		religion= new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel category1 = new JLabel("Category:");
		category1.setFont(new Font("Raleway", Font.BOLD, 20));
		category1.setBounds(100, 190, 200, 30);
		add(category1);
		
		String valcategory[] = {"General", "OBC", "ST", "SC", "Other"};
		category = new JComboBox(valcategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel income1 = new JLabel("Income:");
		income1.setFont(new Font("Raleway", Font.BOLD, 20));
		income1.setBounds(100, 240, 200, 30);
		add(income1);
		
		String incomecategory[] = {"Null", "<1,50,000 ", "<2,50,000", "< 5,00,000", "Upto 10,00,000"};
		income = new JComboBox(incomecategory);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel education1 = new JLabel("Eductional");
		education1.setFont(new Font("Raleway", Font.BOLD, 20));
		education1.setBounds(100, 290, 200, 30);
		add(education1);
		
		JLabel qualification = new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway", Font.BOLD, 20));
		qualification.setBounds(100, 315, 200, 30);
		add(qualification);
		
		String educationValues[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
		education = new JComboBox(educationValues);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.WHITE);
		add(education);	
		
		JLabel occ = new JLabel("Occupation:");
		occ.setFont(new Font("Raleway", Font.BOLD, 20));
		occ.setBounds(100, 390, 200, 30);
		add(occ);
		
		String occupationValues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
		occupation = new JComboBox(occupationValues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel pan1 = new JLabel("PAN Number:");
		pan1.setFont(new Font("Raleway", Font.BOLD, 20));
		pan1.setBounds(100, 440, 200, 30);
		add(pan1);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleway", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		add(pan);
		
		JLabel aadhar1 = new JLabel("Aadhar Number:");
		aadhar1.setFont(new Font("Raleway", Font.BOLD, 20));
		aadhar1.setBounds(100, 490, 200, 30);
		add(aadhar1);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		add(aadhar);
		
		JLabel seniorciti = new JLabel("Senior Citizen:");
		seniorciti.setFont(new Font("Raleway", Font.BOLD, 20));
		seniorciti.setBounds(100, 540, 200, 30);
		add(seniorciti);
		
		syes = new JRadioButton("Yes");
		syes.setBounds(300, 540, 100, 30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setBounds(450, 540, 100, 30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup seniorcitizengroup = new ButtonGroup();
		seniorcitizengroup.add(syes);
		seniorcitizengroup.add(sno);
		
		JLabel exac = new JLabel("Exisiting Account:");
		exac.setFont(new Font("Raleway", Font.BOLD, 20));
		exac.setBounds(100, 590, 200, 30);
		add(exac);
		
		eyes = new JRadioButton("Yes");
		eyes.setBounds(300, 590, 100, 30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setBounds(450, 590, 100, 30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup existingacgroup = new ButtonGroup();
		existingacgroup.add(eyes);
		existingacgroup.add(eno);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next); 
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String sreligion = (String) religion.getSelectedItem(); //setText
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;

		if (syes.isSelected() ) {
			seniorcitizen = "Yes";
		} else if (sno.isSelected()) {
			seniorcitizen = "No";
		}
		
		String existingaccount = null;
		if (eyes.isSelected()) {
			existingaccount = "Yes";
		} else if (eno.isSelected()) {
			existingaccount = "No";
		} 
		
		String span = pan.getText();
		String saadhar = aadhar.getText();
		
		try {
				Conn c = new Conn();
				String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"','"+seducation+"','"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
				c.s.executeUpdate(query);
				
				//Signup3 Object
				setVisible(false);
				new SignupThree(formno).setVisible(true);
			} catch (Exception e) {
				System.out.println(e);
		}	
	}

	public static void main(String[] args) {
		new SignupTwo(" ");

	}

}

