package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;


import in.co.util.JDBCDataSource;

public class Text2Database {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n=101; 
		//GenricProductModel gpm =new GenricProductModel();
		Add2Database gpm=new Add2Database();
		try {
			System.out.println("in text2Databasec 1");
		File inputFile =new File("G:/Java/Template/Medical Store/Medico/GenricProduct.txt");
		System.out.println("in text2Databasec 2");
		//String input = "/Vit.B1+B6+B12+D-Pantehnol 50mg/Vit.B1+B6+B12+D-Pantehnol 50mg /Vitamin B Complex/Vitamin B Complex ";  
	     //@SuppressWarnings("resource")
		Scanner s;
		
			s = new Scanner(inputFile).useDelimiter("\\s*/\\s*");
			while(s.hasNext()){
		    	String sn="G"+n;
				//System.out.println(sn);
		        System.out.println(s.next());
		        gpm.add(sn, s.next());
		        //System.out.println(s.next());
		        //System.out.println(s.next());
		     //s.next();  
		       n++;
		     }
		     s.close();   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}  //use this "\\s*fish\\s*"
	     
	     

	}

}

class Add2Database {
	private static Logger log = Logger.getLogger(Add2Database.class);
	
	public void add(String x,String y){
	Connection conn = null;
	
	try{
	System.out.println("in GenricProductModel 1");
	Class.forName("com.mysql.jdbc.Driver");  
	 conn=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3309/dbmedico","root","1234");  
		conn.setAutoCommit(false);
		//pk = nextPK();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO test1 VALUES(?,?)");
		ps.setString(1, x);
		ps.setString(2, y);
		ps.executeUpdate();
		conn.commit(); // End transaction
		ps.close();
	} catch (Exception e) {
		log.error("Database Exception..", e);
		try {
			conn.rollback();
		} catch (Exception ex) {
			ex.printStackTrace();
			
	} finally {
		if (conn != null) {
		try {
			conn.close();
		} catch (SQLException ee) {
			ee.printStackTrace();
		}}
		//JDBCDataSource.closeConnection(conn);
	}
}}}
