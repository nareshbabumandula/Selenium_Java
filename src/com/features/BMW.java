package com.features;

public class BMW {

	public static void main(String[] args) {
		 
		String Color="White";
		
		// Lambda
		//Car c=()->{System.out.println("Color is " + Color);};
		//c.Color();
		
		// Lambda with Single Parameter
		Car c= (speed)->{System.out.println(Color + " car going with a speed of - "+ speed);};
		c.Speed(100);
	}

}
