package net.mike.dbfdriver;

import java.io.IOException;
import java.text.ParseException;

import net.mike.dbfdriver.driver.DbfDriver;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbfDriver driver = new DbfDriver();
		try {
			driver.readDBF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
