package com.laundry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.laundry.utility.Connections;

public class Views {

	public static void display() {

		Connections c = new Connections();
		Connection conn = c.connect1();
		{
			try {
				Statement st = conn.createStatement();

				ResultSet rs = st.executeQuery("select * from customer");
				System.out.printf("Id \t" + "Name\t" + "Items\t" + "Quantity\t" + "Category\t");

				while (rs.next()) {

					int id = rs.getInt("id");
					String name = rs.getString("name");
					String item = rs.getString("item");
					int quantity = rs.getInt("quantity");
					String category = rs.getString("category");
					
                    System.out.println();
					System.out.printf(id + "\t" + name + "\t" + item + "\t" + quantity + "\t\t" + category + "\t");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}