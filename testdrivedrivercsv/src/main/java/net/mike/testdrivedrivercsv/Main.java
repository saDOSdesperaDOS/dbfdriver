package net.mike.testdrivedrivercsv;

import net.mike.dbfdriver.driver.DbfDriver;
import net.mike.dbfdriver.reader.DbfReader;

import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbfDriver driver = new DbfDriver();
		try {
			driver.readDBF();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Parse Exception");
		}
	}
}
