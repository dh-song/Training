package ex1.test;

import java.util.List;

public class ForTest {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

//			if (i == 2) {
//				continue;
//			}
//			if (i == 3) {
//				break;
//			}
			if (i < 2) {
				continue;
			}
			System.out.print("☆");
			System.out.printf("%d", i + 1);
			if (i != 4) {
				System.out.print(",");
			}

		}
//		---------- 배열 향상된 for문
		
//		String[] str = {"1조","2조","3조","4조","5조"};

//		System.out.println();
//		for (String str2 : str ) {
//			System.out.println(str2);
//		}
		
//		

	}

}
