package com.factoryDesign;

public class BookingFactory {

	public static Booking createBooking(String input) {
		if (input.equalsIgnoreCase("first")) {
			return new FirstTier();
		} else if (input.equalsIgnoreCase("second")) {
			return new SecondTier();
		} else if (input.equalsIgnoreCase("third")) {
			return new ThirdTier();
		}
		throw new IllegalArgumentException("Invalid input from user..");
	}


}
