package ex5;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;

	public Exam() { // new 생성자, 초기화
//		kor=30; 불가능
		this(0, 0, 0); //생성자는 이름이 없기 때문에 this 사용
//		kor=30; 생성된 후라 가능
	}
	
	public Exam(int kor, int eng, int math) { //생성자 오버로드
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
		print('-');

	}

	public void print(char ch) {
		print(ch, 30);
	}

	public void print(char ch, int leng) {
		int total = total();
		double avg = avg();
		System.out.printf("kor: %d\n", this.kor);
		System.out.printf("eng: %d\n", this.eng);
		System.out.printf("math: %d\n", this.math);
		for (int i = 0; i < leng; i++) {
			System.out.printf("%c", ch);
		}

	}

	private double avg() {
		return total() / 3.0;
	}

	private int total() {
		return kor + eng + math ;

}
}
