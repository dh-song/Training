package ex1.test;

public class BasicFunction {
	
	static int f1(int x){
		
		return 3+x*23;
	}
	
	static int add(int a, int b) {
		
		return a+b;
	}
	static void printSum(int sum) {
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		int result = 3+4*23-23+345-23;
		
		System.out.printf("result is %d\n", result);
		
		result = f1(add(2,3))-23+345-23+add(2,3);
		
		System.out.printf("result is %d\n", result);
		

	}

}
