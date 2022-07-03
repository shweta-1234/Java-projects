package com.laundry.controller;

import java.util.Scanner;

import com.laundry.dao.Invoices;

public class Bills {
   
	public static void generatebills() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id :");
		int id = sc.nextInt();
		Invoices.bill(id);
	}
}
