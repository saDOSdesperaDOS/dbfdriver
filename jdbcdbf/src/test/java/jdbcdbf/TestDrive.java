package jdbcdbf;

public class TestDrive {

	public static void main(String[] args) {
	       try { 
	            Class.forName("com.caigen.sql.dbf.DBFDriver"); 
	            System.out.println("com.caigen.sql.dbf.DBFDriver - class found"); 
	            Class.forName("com.linuxense.javadbf"); 
	            System.out.println("com.linuxense.javadbf - class found"); 

	        }catch (ClassNotFoundException e) { 
	        	 System.out.println("class not found"); 
	        	e.printStackTrace(); 
	        } 
	}

}
