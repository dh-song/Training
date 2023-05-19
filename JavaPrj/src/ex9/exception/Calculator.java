package ex9.exception;

public class Calculator {
		
	public static int add(int x, int y) throws massNum, negativeNum {
		int result = x+y;

				if (result > 1000) {
                    throw new massNum();
                }

                if (result < 0) {
                    throw new negativeNum();
                }

		return result;
	}
	
	public static int sub(int x, int y) {
		int result = x-y;
		
		return result;
	}
	
	public static int multi(int x, int y) {
		int result = x*y;
		
		return result;
	}
	
	public static int div(int x, int y) {
		int result = x/y;
		
		return result;
	}
}
