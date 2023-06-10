package com.ust.ioc;

public class Login {
	
	private String userName;
	private String password;
	DbConnection db;
	
	public DbConnection getDb() {
		return db;
	}



	public void setDb(DbConnection db) {
		this.db = db;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String validate() {
		//obtain connection and writes sql to verify userName and password exist in database
		
//		DbConnection db = new DbConnection();
		//db = new DbConnection();
		Connection con = db.getConnection();
//		return "connected to db...";
		return "Login validated";
		
	}

}
