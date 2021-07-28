package ch02_1_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
//		System.out.println(v1);
		
		if(v1 > 10) {
//			System.out.println(v1);
			int v2;
			v2 = v1 - 10;
//			System.out.println(v2);
			}
		for (int i=0; i<10; i++) {
			int v3 = 500;
			System.out.println(v3);
			System.out.println(i);
		}
		
	}
}