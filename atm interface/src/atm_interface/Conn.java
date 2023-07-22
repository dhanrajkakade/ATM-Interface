package atm_interface;

import java.sql.*;

public class Conn {

		//Create Connection
		Connection c;
		Statement s;
		public Conn() {
			try {
				//Register Driver
				
				c = DriverManager.getConnection("jdbc:mysql:///atminterface" , "root" , "root");
				//create statement
				s = c.createStatement();
				//Connection Create
			} catch (Exception e) {
				System.out.println(e);
		}


	}

}
