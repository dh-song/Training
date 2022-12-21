package ex7.is_a;

import java.util.Scanner;

public class ExamConsole {
	private Exam exam; //has a 관계
	
	public ExamConsole() {
		exam = new Exam(); //콘솔 만들면서 exam 초기화 생성 - 컴포지션 관계
	}

	public void input() {
		Scanner scanner = new Scanner(System.in); // 문자열 입력

		System.out.println("┌────────┐");
		System.out.println("│      성적 입력      │");
		System.out.println("└────────┘\n");

		int kor;
		int eng;
		int math;
		while (true) {
			try {
				System.out.print("kor:");
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
		exam.setKor(kor);
		
		while (true) {
			try {
				System.out.print("eng:");
				eng = scanner.nextInt();
				if (eng < 0 || 100 < eng) {
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
		exam.setEng(eng);
		
		while (true) {
			try {
				System.out.print("math:");
				math = scanner.nextInt();
				if (math < 0 || 100 < math) {
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
		exam.setMath(math);
	}
	
	

	public void print() {
		print('-');

	}

	public void print(char ch) {
		print(ch, 30);
	}

	public void print(char ch, int leng) {
		int total = exam.total();
		double avg = exam.avg();
		System.out.printf("kor: %d\n", exam.getKor());
		System.out.printf("eng: %d\n", exam.getEng());
		System.out.printf("math: %d\n", exam.getMath());
		for (int i = 0; i < leng; i++) {
			System.out.printf("%c", ch);
		}

	}
}
