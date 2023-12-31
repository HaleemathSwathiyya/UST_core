package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection implements Connection{
	
	private String url;
	private String dbUserName;
	private String dbPassword;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDbUserName() {
		return dbUserName;
	}


	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}


	public String getDbPassword() {
		return dbPassword;
	}


	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	
	public DbConnection getConnection() {
		
		try {
			java.sql.Connection con =DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("connected to mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get connection called...");
		return new DbConnection();
		

		
//		System.out.println("getConnection called...");
//		return new DbConnection();
	}

}
