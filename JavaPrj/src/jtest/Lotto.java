package jtest;

import java.util.Random;

public class Lotto {

	private int[] lotto;

	public Lotto() {
		lotto = new int[50];
		for (int i = 0; i < 50; i++) {
			lotto[i] = i + 1;
		}
	}

	public int[] generateNumbers() {
		Random ran = new Random();
		int[] nums = new int[6];
		int i = 0;

		while (i < 6) {
			int ranNum = ran.nextInt(50);
			if (numCheck(nums, ranNum)) {
				nums[i] = lotto[ranNum];
				i++;
				continue;
			}
		}

		return nums;
	}

	private boolean numCheck(int[] nums, int ranNum) {
		for (int i = 0; i < 6; i++) {
			if (nums[i] == lotto[ranNum]) {
				return false;
			}
		}
		return true;
	}
}
