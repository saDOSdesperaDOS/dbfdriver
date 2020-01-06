package net.mike.testdrivedrivercsv;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import org.xbib.jdbc.csv.CsvResultSet;
import org.xbib.jdbc.csv.CsvStatement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.xbib.jdbc.csv.CsvDriver");
		System.out.println("Driver registered");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while(drivers.hasMoreElements()) System.out.println(drivers.nextElement());		
		//Connection con = DriverManager.getConnection( "jdbc:dbf:///C:/Users/mike/Desktop/pricesAlexAuto/AlexOffice/MU.dbf");
		Connection con = DriverManager.getConnection( "jdbc:xbib:csv:/home/snake2/temp/crosses");
		System.out.println("Connection estabilish");
	    try {
	    	int idF = 0;
	    	String qry = "select * from crosses_SWAG";
	        CsvStatement st = (CsvStatement) con.createStatement();
	        CsvResultSet rs = (CsvResultSet) st.executeQuery(qry);
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
	        	}
	    }
	}
