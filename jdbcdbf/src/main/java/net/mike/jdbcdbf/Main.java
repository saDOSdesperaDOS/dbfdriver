package net.mike.jdbcdbf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		    /*Connection con = DriverManager.getConnection( "jdbc:dbf:///C:/Users/mike/Desktop/pricesAlexAuto/AlexOffice/MU.dbf");

		    try {
		    	int idF = 0;
		    	String qry = "select * from MU";
		        Statement st = con.createStatement();
		        ResultSet rs = st.executeQuery(qry);
		        while (rs.next()) {
		        	int idS = idF++;
		        	String name = rs.getString(2);
		        	String code1 = rs.getString(4);
		        	String code2 = rs.getString(5);
		        	String code3 = rs.getString(6);
		        	String analogs = rs.getString(7);
		        	System.out.println(idS + "||" + name + "|| "  + code1 + "|| " + code2 + "|| " + code3 + "|| " + analogs);
		      }
		        rs.close();
		        st.close();
		        } finally {
		        	con.close();
     	        	}*/
		Class.forName("com.linuxense.javadbf");
    }
}
