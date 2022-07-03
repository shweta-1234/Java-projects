package com.laundry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.laundry.utility.Connections;

public class Category {

	public static void table() {

		Connections c = new Connections();
		Connection conn = c.connect1();
		{
			try {

				Statement st = conn.createStatement();

				ResultSet rs = st.executeQuery("select * from category");
				System.out.printf("Id \t" + "Items\t" + "Wash\t" + "Iron\t" + "Both_price");

				while (rs.next()) {

					int id = rs.getInt("id");
					String items = rs.getString("items");
					int washing_price = rs.getInt("washing_price");
					int ironing_price = rs.getInt("ironing_price");
					int both_price = rs.getInt("both_price");
					System.out.println();
					System.out.printf(
							id + "\t" + items + "\t" + washing_price + "\t" + ironing_price + "\t" + both_price);
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