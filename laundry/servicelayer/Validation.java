package com.laundry.servicelayer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.laundry.controller.Mainclass;
import com.laundry.dao.Newbooking;
import com.laundry.entity.Customer;

public class Validation {

	public static boolean checkname(String name) {
		String str = "" + name;
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(str);
		m.matches();
		return (m.matches());

	}

	public static boolean checkitem(String item) {
		String str = "" + item;
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(str);
		m.matches();
		return (m.matches());
	}

	public static boolean checkquantity(int quantity) {
		String str = "" + quantity;
		String syntax = "^[0-9]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(str);
		m.matches();
		return (m.matches());
	}

	public static boolean checkcategory(String category) {
		String str = "" + category;
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(str);
		m.matches();
		return (m.matches());

	}

	public static void checks(Customer c) {
		if (Validation.checkname(c.getName()) && Validation.checkitem(c.getItem())
				&& Validation.checkquantity(c.getQuantity()) && Validation.checkcategory(c.getCategory())) {
			Newbooking.addlaundry();
		} else {
			Mainclass.main(null);
		}
	}
}