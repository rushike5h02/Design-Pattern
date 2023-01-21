package com.factoryDesign;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		try {

			String booking;
			System.out.println("Enter the AC class type>>");
			Scanner scanner = new Scanner(System.in);
			booking = scanner.next();
			Booking b = BookingFactory.createBooking(booking);
			System.out.println(b.getACClass());
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
