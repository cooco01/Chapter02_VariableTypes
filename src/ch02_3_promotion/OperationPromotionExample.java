package ch02_3_promotion;

public class OperationPromotionExample {
	public static void main(String[] args) {
		
		// byte �� ����
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		int result1 = bytevalue1 + bytevalue2;
		System.out.println(result1);
		
		// char �� ����
		char charvalue1 = 'A';
		char charvalue2 = 1;
		int result2 = charvalue1 + charvalue2;
		System.out.println("�����ڵ� : " + result2);
		System.out.println("��¹��� : " + (char)result2);
		
		// int �� ����
		int intvalue3 = 10;
		int intvalue4 = intvalue3/4;
		System.out.println(intvalue4);
		
		// int -> double
		int invalue5 = 10;
		double doublevalue = invalue5 / 4.0;
		System.out.println(doublevalue);
		
		// double 	
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}
}
