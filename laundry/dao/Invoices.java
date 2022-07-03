package com.laundry.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.laundry.utility.Connections;

public class Invoices {
	public static void bill(int id) {
		Connections c = new Connections();
		Connection conn = c.connect1();
		try {
			Statement st = conn.createStatement();
			Statement st1 = conn.createStatement();
			ResultSet rs = st.executeQuery("select item,category, quantity from customer where id=" + id);
			while (rs.next()) {
				String s1 = rs.getString("item");
				String s2 = rs.getString("category");
				int quantity = rs.getInt("quantity");
				int s3=0;
				ResultSet rs2 = st1.executeQuery("select * from category where items='" + s1 + "'");
				while (rs2.next()) {
					if (s2.equals("washing")) {
						s3 = rs2.getInt("washing_price");
					} else if (s2.equals("ironing")) {
						s3 = rs2.getInt("ironing_price");
					} else if (s2.equals("both")) {
						s3 = rs2.getInt("both_price");
					}
				}
				int totalprice = quantity * s3;
				System.out.println("The total price of booking is:" + totalprice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
