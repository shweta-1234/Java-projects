package com.laundry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.laundry.utility.Connections;

public class Newbooking {

	private static String name;
	private static String item;
	private static int quantity;
	private static String category;
	static Scanner s = new Scanner(System.in);

	public Newbooking(String name, String item, int quantity, String category) {
		super();
		this.name = name;
		this.item = item;
		this.quantity = quantity;
		this.category = category;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getitem() {
		return item;
	}

	public void setitem(String item) {
		this.item = item;
	}

	public int quantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public String category() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public static void addlaundry() {
		System.out.println("Enter your name:");

		String name = s.nextLine();
		s.nextLine();

		System.out.println("Enter name of items :");
		String item = s.nextLine();

		System.out.println("Enter total number of quantity of items:");
		int quantity = s.nextInt();

		System.out.println("Enter category :");
		s.nextLine();
		String category = s.nextLine();

		Newbooking b = new Newbooking(name, item, quantity, category);
		boolean ans = Newbooking.booklaundry(b);
	   
		if (ans) {
			System.out.println("Added successfully");
		} else {
			System.out.println("Please try again!!!");
		}

		System.out.println(b);
	}

	public static boolean booklaundry(Newbooking b) {
		boolean b1 = false;
		try {
			Connections c = new Connections();
			Connection conn = c.connect1();

			String q = "insert into customer(name, item, quantity,category) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setString(1, name);
			ps.setString(2, item);
			ps.setInt(3, quantity);
			ps.setString(4, category);

			ps.executeUpdate();

			b1 = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b1; 
	}

}
