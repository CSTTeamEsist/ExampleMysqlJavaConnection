package com.mattbozelka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

	private Connection connect = null;
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
	
    public ResultSet readDataBase() throws Exception {
    	try {
    		
    		Class.forName("com.mysql.jdbc.Driver");
    		connect = DriverManager
    		          .getConnection("jdbc:mysql://localhost/CLEANUPSTARS?"
    		              + "user={username}&password{password}");
    		
    		statement = connect.createStatement();
    		
    		resultSet = statement.executeQuery("select * from CLEANUPSTARS.VOLUNTEER");
    		
    		return resultSet;
    		
    	}catch(Exception e){
    		
    		throw e;
    		
    	}finally{
    		closeDB();
    	}
    }
    
    public void closeDB() throws SQLException{
    	connect.close();
    }
}
