package ch02_4_console_in_out;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws Exception{
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}
}
