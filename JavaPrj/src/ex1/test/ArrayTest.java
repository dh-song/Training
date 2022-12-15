package ex1.test;

import java.util.Random;

public class ArrayTest {

	static void printNums(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d", a[i]);
			if (i != (a.length - 1)) {
				System.out.print(",");
			}
		}
	}
	
	public static void main(String[] args) {
			
		int[] nums = {20,5,7,98,45,7,45,62,12,47};
		
		printNums(nums);
		

		Random rand = new Random();
		int s = rand.nextInt(10);
		int d = rand.nextInt(10);

		rand.nextInt(10); // 0~9
		
		
		System.out.println();
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
		
		for (int i : nums) {
			System.out.printf("%d,", i);
		}

	}
	
	double cnt = print (true, 4.0, names);
	
	 double print(boolean a, dobule b ,char[][] c)
			return 2.2;

}
