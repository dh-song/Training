package ex4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) throws IOException {

		int answer = 1;
		int[] kors = new int[3];
		double avg;
		int menu;

		CHK1: while (answer == 1) {

			// 시스템 입력
			{
				System.out.println("┌───────────────────┐");
				System.out.println("│      메인 메뉴       │");
				System.out.println("└───────────────────┘\n");
				System.out.println("성적 입력(1)");
				System.out.println("파일 입력(2)");
				System.out.println("성적 저장(3)");
				System.out.println("성적 출력(4)");
				System.out.println("종료(5)");
				System.out.printf(">");
				Scanner scanner = new Scanner(System.in);

				menu = scanner.nextInt();

			}

			switch (menu) {

			case 1: {

				// 시스템 입력

				Scanner scanner = new Scanner(System.in); // 문자열 입력

				System.out.println("┌───────────────────┐");
				System.out.println("│      성적 입력       │");
				System.out.println("└───────────────────┘\n");

				for (int i = 0; i < 3; i++) {
					int kor;
					System.out.printf("kor%d:", i + 1);

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
						kors[i] = kor;
						break;
					}

				}

				System.out.println("성적 입력 완료");

			}
				break;

			case 2: {
//	 		파일 출력

				FileOutputStream fos = new FileOutputStream("res/data.txt");

				PrintStream out = new PrintStream(fos);

				for (int i = 0; i < kors.length; i++) {
					out.printf("%d ", kors[i]);
				}

				fos.close();

				System.out.println("성적 파일에 반영 완료");
			}
				break;

			case 3: {

				// -----------------------------------------
				// 파일 입력
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scanner = new Scanner(fis);

				for (int i = 0; i < kors.length; i++) {
					kors[i] = scanner.nextInt();
				}

				fis.close();
				System.out.println("파일 변수 저장 완료");

				System.out.printf("입력값:");
				for (int in : kors) {
					System.out.printf(" %d,", in);
				}
				System.out.println();

			}
				break;
			case 4: {

				// -----------------------------------------

				// 시스템 출력
				System.out.println("┌───────────────────┐");
				System.out.println("│      성적 출력       │");
				System.out.println("└───────────────────┘\n");
				for (int j = 0; j < kors.length; j++) {
					int total = 0;
					for (int i = 0; i < 3; i++) {
						total += kors[i];
					}

					avg = total / 3.0;// 묵시 형변환
					System.out.printf("<%d>--------------------\n", j + 1);

					for (int i = 0; i < 3; i++) {
						System.out.printf("국어%d :" + kors[i], i + 1, kors[i]);
						System.out.println();
					}
					System.out.println("총점 :" + total);
					System.out.printf("평균 :%6.2f\n", avg); // 총 6자리(.포함).이후 자리
				}

			}
				break;

			case 5: {

				// ------------------------------------------------------

				System.out.println("계속 하시겠습니까?(1)종료(0)");

				Scanner scanner = new Scanner(System.in);

				while (true) {
					try {
						answer = scanner.nextInt();
						if (answer < 0 || answer >= 2) {
							System.out.println("0 이나 1");
						}

					} catch (Exception e) {
						scanner.nextLine();
						System.out.println("0 이나 1");
						continue;
					}
					if (answer == 0 || answer == 1) {
						break;
					}
				}

			}
				break;

			default: {
				System.out.println("1~5입력값이 아닙니다. 종료");
			}
				break CHK1;

			}
		}
		System.out.println("ㅂㅂ");

	}
}
