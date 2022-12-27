package test;

public class Artr {

	public static void main(String[] args) {
		int a = 1;
		int[] b = new int[5];
		System.out.println("a= "+a);
		System.out.println("b= "+b[0]);
		
		a += 1;
		a += 1;
		System.out.println("a= "+a);
		
		b[0] += 1;
		b[0] += 1;
		b[0] += 1;
		b[0] += 1;
		System.out.println("b= "+b[0]);
	}

}
