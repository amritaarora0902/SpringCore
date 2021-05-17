package com.amrita.spring.springcore.assignment1;

public class Item {
private DBConfig dbConfig;
	
	public DBConfig getDbConfig() {
		return dbConfig;
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

	@Override
	public String toString() {
		return dbConfig + " ";
	}
}
