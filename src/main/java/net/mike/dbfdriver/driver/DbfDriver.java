package net.mike.dbfdriver.driver;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParseException;

import net.mike.dbfdriver.core.DbfMetadata;
import net.mike.dbfdriver.core.DbfRecord;
import net.mike.dbfdriver.reader.DbfReader;

public class DbfDriver {
	
	Charset stringCharset = Charset.forName("Cp866");
    static File f =  new File("C:\\Users\\mike\\Desktop\\pricesAlexAuto\\AlexOffice\\MU.dbf");

	 public void readDBF() throws IOException, ParseException {
	        
	        DbfRecord rec;
	        try (DbfReader reader = new DbfReader(f)) {
	            DbfMetadata meta = reader.getMetadata();

	            System.out.println("Read DBF Metadata: " + meta);
	            while ((rec = reader.read()) != null) {
	                rec.setStringCharset(stringCharset);
	                System.out.println(rec.getRecordNumber() + ": " + rec.toMap());
	            }
	        }
	    }
}
