package com.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("./Files/Test Data.txt");
		BufferedReader br = new BufferedReader(fr);
		
		/*
		 * int c;
		 * 
		 * while ((c=br.read())!=-1) { System.out.println((char)c); }
		 */
		
		String s;
		
		while(br.ready()) {
			System.out.println(br.readLine());
		}
		
		br.close();
		fr.close();

	}

}
