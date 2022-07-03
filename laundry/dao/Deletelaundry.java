package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.laundry.utility.Connections;

public class Deletelaundry {

	public static void deleted(int id) {
		Connections c = new Connections();
		Connection conn = c.connect1();
		String sql = "delete from customer where id = ?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			System.out.println("Booking deleted");
		} catch (SQLException e) {
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
