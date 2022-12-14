package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExamApp {

	public static void main(String[] args) throws IOException {
//		int cf;
//		String cf;
//		 do {   [do while 흔적]
		/*
		 * ConsoleOutputStream out = new ConsoleOutputStream(); 
		 * System.out.write('A');
		 * System.out.write('e'); 
		 * System.out.flush(); 
		 * System.out.println("Hello");
		 * out.close(); 
		 * 시스템은 close X
		 */
		int answer = 1;
		int[] kors = new int[3];
		double avg;
		int menu;

		CHK1:
			while (answer == 1) {

//			int kor1;
//			int kor2;
//			int kor3 = 0;
			
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
//				while (true) {
//
//					try {
//						menu = scanner.nextInt();
//						if (menu < 0 || menu > 5) {
//							System.out.println("1~5를 입력하세요.>");
//							continue;
//						}
//					} catch (Exception e) {
//						scanner.nextLine();
//						System.out.println("1~5를 입력하세요.>");
//						continue;
//					} break;
//				}

			}
			
			switch (menu) {
			
			case 1: {

				// 시스템 입력

				Scanner scanner = new Scanner(System.in); // 문자열 입력

				System.out.println("┌───────────────────┐");
				System.out.println("│      성적 입력       │");
				System.out.println("└───────────────────┘\n");


				// kor1 = System.in.read(); 입력은 문자 하나 아스키 값을 저장, 비어있을 때 프롬프트 팝업
//			kor1 = scanner.nextInt();
//			while(kor1<0 || 100<kor1){
//				System.out.println("점수는 0~100");
//				System.out.print("kor1:");
//				kor1 = scanner.nextInt();
//			}
				
				for (int i = 0; i < 3; i++) {
					int kor;
					System.out.printf("kor%d:", i+1);
//					do {
//						System.out.printf("kor%d:", i+1);
//						kor = scanner.nextInt();
//						if (kor < 0 || 100 < kor) {
//							System.out.println("점수는 0~100");
//						}
//					} while (kor < 0 || 100 < kor);
//					kors[i] = kor;
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
				
				

				
//				배열 값 확인
//				System.out.printf("입력값:"); 
//				for (int in : kors) {
//					System.out.printf(" %d,",in);
//				}
//				System.out.println();
				
//					System.out.println(str2);
//				}
//				scanner.nextLine();
				
//				FileOutputStream fos = new FileOutputStream("res/data.csv");
//				String k1 = Integer.toString(kor1);
//				String k2 = Integer.toString(kor2);
//				String k3 = Integer.toString(kor3);
//				String str = k1+","+k2+","+k3;
//	//			
//				fos.write(str.getBytes());
//				fos.close();
				System.out.println("성적 입력 완료");

			} break;
			
			case 2: {
//	 		파일 출력

				FileOutputStream fos = new FileOutputStream("res/data.txt");
				// BufferedOutputStream bs = new BufferedOutputStream(fos); 속도가 더 빠름
				PrintStream out = new PrintStream(fos);// File에 이용한 출력 (시스템 출력을 파일에 기록)
				

//				System.out.printf("입력값:");
//				for (int in : kors) {
//					System.out.printf(" %d,",in);
//				}
//				System.out.println();
				for (int i = 0; i < kors.length; i++) {
					out.printf("%d ", kors[i]);
				}
				
//				----- ,방식
//				for (int i = 0; i < kors.length; i++) {
//					out.printf("%d", kors[i]);
//					if ( i == (kors.length - 1)) {
//						out.print("\n");
//					} else {
//						out.print(",");
//					}
//				}

				fos.close();
				/*
				 * ----------------------------------------파일에 출력 테스트
				 * out.print(total+"\n");
				 * out.print(avg+"\n"); 
				 * out.println("┌───────────────────┐");
				 * out.println("│      성적 출력       │");
				 * out.println("└───────────────────┘\n");
				 * out.println("국어1 :"+ kor1);
				 * out.printf("국어2 :%3d\n", 90);
				 * out.println("국어3 : 0\n");
				 * out.println("총점 : 0");
				 * out.printf("평균 :%f\n", avg);
				 * out.printf("평균 :%6.2f\n", avg); //총 6자리(.포함).이후 자리
				 * ---------------------------------------------
				 */
				// out.print("Hello File\r\n");
				/*
				 * String str = "sdkfjlaemfkl\r\nef ㄹ달질디맏ㄴ아럼\r\nㄴ이런미ㅏ얼ㄴㄹ";
				 *  \r\n 줄바꿈
				 * fos.write('A');
				 * fos.write('e');
				 * fos.write(str.getBytes());
				 * fos.flush();
				 * fos.close();
				 */
				System.out.println("성적 파일에 반영 완료");
			}
				break;

			case 3: {

				// -----------------------------------------
				// 파일 입력
				FileInputStream fis = new FileInputStream("res/data.txt");
				Scanner scanner = new Scanner(fis);

//				String str = scanner.nextLine();
				for (int i = 0; i < kors.length; i++) {
					kors[i] = scanner.nextInt();
				}
				
//				String str = scanner.nextLine();
//				String[] kors2 = str.split(",");
//				for (int i = 0; i < kors2.length; i++) {
//					kors[0] = Integer.parseInt(kors2[i]);
//				}

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

//if (answer == 0) {
////	System.out.println("ㅂㅂ");
//	break;
////if (answer == 0) {
////	System.out.println("ㅂㅂ");
////	break;
////}
	

//			Scanner scanner = new Scanner(System.in); [do while 흔적]
//			System.out.print("계속(예) 종료(아무키): ");
////			cf = scanner.nextInt();
//			cf = scanner.nextLine();
//		 }while (cf.equals("예"));
//		 System.out.println("종료됨");
