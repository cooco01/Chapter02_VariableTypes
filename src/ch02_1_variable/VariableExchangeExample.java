package ch02_1_variable;

public class VariableExchangeExample {
	public static void main(String[] args) {
//		������ �Ҵ�� �� ������
		int x = 100;
		int y = 200;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		System.out.println("x�� ��:  "+ x);
		System.out.println("y�� ��:  "+ y);	
	}
}
