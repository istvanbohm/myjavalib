package org.istvanbohm.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public static int readInt(String msg, String errmsg) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(msg);
		while(true){
			try {
				return Integer.parseInt(br.readLine());
			} catch(NumberFormatException ex) {
				System.err.println(errmsg);
			} catch(IOException ex) {
				System.err.println("Error, Failed or interrupted I/O operations");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
			int num = readInt("Adj meg egy számot: ","Invalid Format! Please enter an integer.");
			System.out.println("You entered: " + num);
	}

}
