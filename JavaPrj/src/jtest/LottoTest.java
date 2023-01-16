package jtest;

public class LottoTest {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		int[] nums = new int[6];

		nums = lotto.generateNumbers();

		for (int i : nums) {
			System.out.printf("%d ", i);
		}

	}

}
