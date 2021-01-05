package com.oops.examples;

public abstract class Theater {

	// Method without body/implementation
	public abstract void TicketBooking();
	public abstract void Cafeteria();
	public abstract void Parking();
	public abstract void FireandSafety();
	public abstract void Washrooms();
		
	// Method with body/implementation
	public void wifiFacility(){
		System.out.println("Wifi facility is available..!");
	}
	
	public void onlineBooking(){
		System.out.println("onlineBooking facility is available..!");
	}
	
	// static method
	public static void ticketCancellation() {
		System.out.println("ticketCancellation facility is available..!");
	}
	
	Theater(){
		System.out.println("This is no argument constructor of an abstract class");
	}
	
	public static void main(String[] args) {
		//Theater t = new Theater(); -- Error
		//Theater t = null; - No Error
		ticketCancellation();
		
	}

}
