package net.mike.dbfreaderjpa;

import java.io.IOException;
import java.text.ParseException;


public class TestDrive {

	public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
		/*System.out.println("Start Test Drive.");
		DbfDriver driver = new DbfDriver();
		driver.readDBF();*/
		
		/*ServiceMU request = new ServiceMU();
		request.getBalance();*/
		Class.forName("net.mike.dbfdriver");
	}

}
