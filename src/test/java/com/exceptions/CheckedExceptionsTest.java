package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Checked Exceptions: These are exceptions that must be either caught or declared in the method signature using throws.
 * They are checked at compile time.
🔹 Common Examples: 
    IOException
    SQLException
    FileNotFoundException
    ParseException
 * @author ADMIN
 *
 */
public class CheckedExceptionsTest {

	public static void main(String[] args) {
		try {
			File file = new File("Data.txt");
			FileReader fr = new FileReader(file); // might throw FileNotFoundException
			int character;
			while ((character=fr.read())!=-1) {
				System.out.print((char)character);
			}
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
