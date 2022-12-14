package ex1.test;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
			
		int[] nums = {20,5,7,98,45,7,45,62,12,47};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d", nums[i]);
			if (i != (nums.length - 1)) {
				System.out.print(",");
			}
		}
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

}
