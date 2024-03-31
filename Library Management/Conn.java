/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management;

/**
 *
 * @author kishorkumar
 */

import java.sql.*;

public class Conn {
	Connection c;
	Statement s;

	public Conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost/library_management_system","root","Kishor@2");
			s = c.createStatement();
			
		} catch(Exception e) {
			System.out.println(e); 
		}
	}
	
}
