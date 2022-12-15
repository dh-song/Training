package ex1.test;

public class BasicFunction {
	
	static int f1(){
		
		return 3+4*23;
	}
	public static void main(String[] args) {
		
		int result = 3+4*23-23+345-23;
		
		System.out.printf("result is %d\n", result);
		
		result = f1() -23+345-23;
		
		System.out.printf("result is %d\n", result);
		

	}

}
