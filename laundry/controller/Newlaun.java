package com.laundry.controller;

import java.util.Scanner;

import com.laundry.dao.Deletelaundry;
import com.laundry.dao.Updatelaundry;
import com.laundry.entity.Customer;
import com.laundry.servicelayer.Validation;
import com.laundry.view.Display;

public class Newlaun {

	public static void addlaun() {
		Display.newbook();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("New Booking:");
//			Newbooking.addlaundry();
			Customer c = new Customer();
			Validation.checks(c);
			break;

		case 2:
			System.out.println("Update existing :");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Customer Id");
			int id = s.nextInt();
			System.out.println("Enter Customer name");
			String name = s.next();
			System.out.println("Enter quantity");
			int quantity = s.nextInt();
			System.out.println("Enter item");
			String item = s.next();
			System.out.println("Enter category");
			String category = s.next();
			Updatelaundry.update(id, name, item, quantity, category);
			System.out.println("Done update...");

			break;

		case 3:
			System.out.println("Delete Booking");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter customer id :");
			int id2 = s1.nextInt();
			Deletelaundry.deleted(id2);
			break;

		}

	}
}
