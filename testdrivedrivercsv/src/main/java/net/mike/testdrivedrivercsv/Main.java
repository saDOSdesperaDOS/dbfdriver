package net.mike.testdrivedrivercsv;

import net.mike.dbfdriver.driver.DbfDriver;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {
	static File dbFile =  new File("d:\\temp\\LM.dbf");
	static File fdbFile =  new File("d:\\temp\\autoshop\\tw_shop.fdb");

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DbfDriver driver = new DbfDriver(fdbFile);
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
