package com.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		
		
		try {
			FileWriter fr = new FileWriter("./Files/Output1.txt");
			BufferedWriter br = new BufferedWriter(fr);
			br.write("Successfully wrote data into the output file");
			br.newLine();
			br.write("Hello world");
		
			
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
