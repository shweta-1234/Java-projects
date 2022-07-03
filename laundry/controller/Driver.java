package com.laundry.controller;

import java.util.Scanner;

import com.laundry.dao.*;
import com.laundry.view.Display;

public class Driver {

	public static void cases() {
		Display.view();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Booking");
			Newlaun.addlaun();
			break;

		case 2:
			System.out.println("Views");
			Views.display();
			System.out.println();
			break;
			
		case 3:
			System.out.println("Invoice");
			Bills.generatebills();
			System.out.println();
			break;
			
		case 4:
			System.out.println("Categories with price are :");
			Category.table();
			System.out.println();
			break;
			
		case 5:
			System.exit(0);
			break;

		default:
			System.out.println("Please check the number and enter again!!!!");
			System.out.println();
			Driver.cases();
		}

	}
}
