package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.laundry.utility.Connections;

public class Updatelaundry {
     
	public static void update(int id, String name, String item, int quantity, String category) {
     
		try {
			Connections c = new Connections();
			Connection conn = c.connect1();

			String q = "update customer set name = ? , item = ? , quantity = ? , category = ?  where id =?";
			PreparedStatement ps = conn.prepareStatement(q);
		
			ps.setString(1, name);
			ps.setString(2, item);
			ps.setInt(3, quantity);
			ps.setString(4, category);	
			ps.setInt(5, id);
       
			ps.executeUpdate();
		   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
