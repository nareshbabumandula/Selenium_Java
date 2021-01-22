package com.io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileWriter fr = new FileWriter("./Files/Output.txt");
			fr.write("Successfully wrote data into the output file");
			fr.write("Hello world");
				
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		

	}

}
