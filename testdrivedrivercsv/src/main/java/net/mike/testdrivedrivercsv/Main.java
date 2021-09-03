package net.mike.testdrivedrivercsv;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.xbib.jdbc.csv.CsvDriver");
		System.out.println("Driver registered");
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while (drivers.hasMoreElements()) System.out.println(drivers.nextElement());
		//Connection con = DriverManager.getConnection( "jdbc:dbf:///C:/Users/mike/Desktop/pricesAlexAuto/AlexOffice/MU.dbf");

	}
}
