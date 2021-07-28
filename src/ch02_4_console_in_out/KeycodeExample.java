package ch02_4_console_in_out;

import java.io.IOException;

public class KeycodeExample {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	
	}
}
