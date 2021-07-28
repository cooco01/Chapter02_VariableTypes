package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		변수에 할당된 값 스와핑
		int x = 100;
		int y = 200;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x의 값:  "+ x);
		System.out.println("y의 값:  "+ y);	
	}
}
