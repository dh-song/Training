package ex1.test;



public class ifTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {

			if (i == 4) {
				System.out.printf("%c", '⊙');
			} else if (i % 2 != 0) {
				System.out.printf("%c", '☆');
			} else {
				System.out.printf("%c", '┼');
			}
//			if (i == 4 || i == 9) {
//				System.out.print("⊙");
//			}
			 
			 
//			 if (i%2 ==0) {
//				System.out.print("⊙");
//				continue;
//			}
//			 System.out.printf("%c", '┼');
		}
	}
}
