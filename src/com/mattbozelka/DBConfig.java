package com.mattbozelka;

public class DBConfig {
	
	public static final String USR = "{YOUR_USER_NAME}";
	public static final String PASS = "{YOUR_PASSWORD}";
	public static final String DB = "{CLEANUPSTARS}";
	
	public static final String CONNECTION = "jdbc:mysql://localhost/" + DBConfig.DB +  "?"
            + "user=" + DBConfig.USR + "&password=" + DBConfig.PASS;
	
}
