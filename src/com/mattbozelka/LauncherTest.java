package com.mattbozelka;

import java.sql.ResultSet;


public class LauncherTest {

	public static void main(String[] args) throws Exception {
		
		DBConnector db = new DBConnector();
    	ResultSet results;
    	
    	results = db.readDataBase();
    	
    	while (results.next()) {
    		
    		String name = results.getString("PASSWORD");
    		System.out.println(name);
    		
    	}
    	
    	db.closeDB();
    	
    	System.out.println();

	}

}
