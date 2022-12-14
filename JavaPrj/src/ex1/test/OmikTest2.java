package ex1.test;


public class OmikTest2 {

	public static void main(String[] args) {
		

		for (int y = 1; y <= 10; y++) {

			for (int x = 1; x <= 10; x++) // 내용

				if (x == 3 && y == 3)
					System.out.printf("%c", '⊙');
				else if (y == 1)
					System.out.printf("%c", '┬');
				else
					System.out.printf("%c", '┼');
		}
		
		


	}
}
