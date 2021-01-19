package com.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("./Files/Test Data.txt");
		BufferedReader br = new BufferedReader(fr);
	
		int c;
		
		while ((c=fr.read())!=-1) {
			System.out.println((char)c);
		}
		br.close();
		fr.close();

	}

}
