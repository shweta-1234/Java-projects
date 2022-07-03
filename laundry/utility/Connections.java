package com.laundry.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.PreparedStatement;

public class Connections {
	public Connection connect1() {
		Connection conn = null;
		try(FileInputStream file = new FileInputStream("src/com/laundry/utility/File.property");) {
			Properties prop = new Properties();
			prop.load(file);
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	return conn;
}
}
