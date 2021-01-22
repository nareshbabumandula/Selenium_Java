package com.io.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./Files/Output2.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
		for(int i=0; i<10; i++) {
			bw.write("Hello World..!");
			bw.newLine();
		}
		bw.close();

	}

}
