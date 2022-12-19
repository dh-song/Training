package ex5;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam(){ //new 생성자, 초기화
		kor = 10;
		eng = 10;
		math = 10;
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in); // 문자열 입력

		System.out.println("┌────────┐");
		System.out.println("│      성적 입력      │");
		System.out.println("└────────┘\n");

		System.out.print("kor:");
		while (true) {
			try {
				kor = scanner.nextInt();
				if (kor < 0 || 100 < kor) {
					System.out.println("점수는 0~100을 입력>");
					continue;
				}

			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("점수는 0~100을 입력>");
				continue;
			}
			break;
		}

	}

	public void print() {
		System.out.printf("kor: %d\n", this.kor);
		System.out.printf("eng: %d\n", this.eng);
		System.out.printf("math: %d\n", this.math);
		System.out.println("-------------");
		
	}


}
