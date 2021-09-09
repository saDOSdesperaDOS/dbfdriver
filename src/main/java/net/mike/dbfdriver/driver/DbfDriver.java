package net.mike.dbfdriver.driver;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Logger;

import net.mike.dbfdriver.core.DbfMetadata;
import net.mike.dbfdriver.core.DbfRecord;
import net.mike.dbfdriver.reader.DbfReader;

public class DbfDriver implements java.sql.Driver {
	DbfReader reader;
	Charset stringCharset = Charset.forName("Cp866");

    public DbfDriver(File dbFile) {
		try {
			reader = new DbfReader(dbFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	 public Map<Integer, Map<String, Object>> getDataDBF() throws IOException, ParseException {
		 DbfMetadata meta = reader.getMetadata();
		 DbfRecord rec;
		 Map<Integer, Map<String, Object>> data = new HashMap<>();
		 System.out.println("Read DBF Metadata: " + meta);
		 while ((rec = reader.read()) != null) {
			 rec.setStringCharset(stringCharset);
			 data.put(rec.getRecordNumber(), rec.toMap());
		 }
		 return data;
     }


	@Override
	public boolean acceptsURL(String arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection connect(String arg0, Properties arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}
}
