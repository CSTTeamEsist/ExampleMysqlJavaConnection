package com.mattbozelka;

import java.sql.ResultSet;
import com.mattbozelka.DBConfig;


public class LauncherTest {

	public static void main(String[] args) throws Exception {
		
		DBConnector db = new DBConnector();
    	ResultSet results;
    	
    	results = db.readDataBase();
    	
    	while (results.next()) {
    		
    		String name = results.getString("PASSWORD");
    		System.out.println(name);
    		
    	}
    	
    	
    	System.out.println();

	}

}
