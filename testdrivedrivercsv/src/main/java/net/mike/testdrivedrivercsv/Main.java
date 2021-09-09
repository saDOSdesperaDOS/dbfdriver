package net.mike.testdrivedrivercsv;

import net.mike.dbfdriver.driver.DbfDriver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

public class Main {
	static File dbFile =  new File("d:\\temp\\dbase\\LM.dbf");
	static File fdbFile =  new File("d:\\temp\\autoshop\\tw_shop.fdb");

	public static void main(String[] args) throws IOException, ParseException {

		DbfDriver driver = new DbfDriver(dbFile);
		Map<Integer, Map<String, Object>> map = driver.getDataDBF();

		for (int i = 1; i < map.size() ; i++) {
			System.out.println(map.get(i).get("NAME"));
		}

	}
}
