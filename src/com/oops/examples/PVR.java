package com.oops.examples;

public class PVR extends Theater{

	public static void main(String[] args) {
		PVR p = new PVR();
		p.TicketBooking();
		p.Parking();
		p.FireandSafety();
		p.Washrooms();
		p.Cafeteria();
		p.onlineBooking();
		p.wifiFacility();
	}

	public void TicketBooking() {
		System.out.println("TicketBooking Facility is available for 3 categories");
	}

	public void Cafeteria() {
		System.out.println("Cafeteria is available..!");
		
	}

	public void Parking() {
		System.out.println("Parking facility is available..!");
		
	}

	public void FireandSafety() {
		System.out.println("FireandSafety");	
	}

	public void Washrooms() {
		System.out.println("Washrooms are available");
	}

}
