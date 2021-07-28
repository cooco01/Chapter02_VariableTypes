package ch02_3_promotion;

public class PromotionExample {
	public static void main(String[] args) {
		// 자동 타입 변환
		
		// byte -> int
		byte bytevalue = 10;
		int intvalue = bytevalue;
		System.out.println("intvalue: " + intvalue);
		
		// char -> int
		char charvalue = '가';
		intvalue = charvalue;
		System.out.println("가의 유니코드:" + intvalue);
		
		// int -> long
		intvalue = 50;
		long longvalue = intvalue;
		System.out.println("longvalue: " + longvalue);
		
		// long -> float
		longvalue = 100;
		float floatvalue = longvalue;
		System.out.println("floatvalue: " + floatvalue);
		
		// float -> double
		floatvalue = 100.5f;
		double doublevalue = floatvalue;
		System.out.println("doublevalue: " + doublevalue);
	}

}
