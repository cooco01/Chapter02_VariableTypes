package ch02_4_console_in_out;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째수: ");
		String str1 = scanner.nextLine();
				
		System.out.println("두 번째수: ");
		String str2 = scanner.nextLine();
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		double value = num1 / num2;
		System.out.println("결과: " + value);
	}
}

