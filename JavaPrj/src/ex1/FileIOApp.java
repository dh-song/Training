package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOApp {

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

		CHK1:
			while (answer == 1) {

			int kor1 = 0;
			int kor2 = 0;
			int kor3 = 0;
			int total;
			double avg;
			int menu;
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


				// kor1 = System.in.read(); 입력은 문자 하나 아스키 값을 저장, 비어있을 때 프롬프트 팝업
//			kor1 = scanner.nextInt();
//			while(kor1<0 || 100<kor1){
//				System.out.println("점수는 0~100");
//				System.out.print("kor1:");
//				kor1 = scanner.nextInt();
//			}

				do {
					System.out.print("kor1:");
					kor1 = scanner.nextInt();
					if (kor1 < 0 || 100 < kor1) {
						System.out.println("점수는 0~100");
					}
				} while (kor2 < 0 || 100 < kor2);
				do {
					System.out.print("kor2:");
					kor2 = scanner.nextInt();
					if (kor2 < 0 || 100 < kor2) {
						System.out.println("점수는 0~100");
					}
				} while (kor2 < 0 || 100 < kor2);

				do {
					System.out.print("kor3:");
					kor3 = scanner.nextInt();
					if (kor3 < 0 || 100 < kor3) {
						System.out.println("점수는 0~100");
					}
				} while (kor3 < 0 || 100 < kor3);

				scanner.nextLine();
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

				FileOutputStream fos = new FileOutputStream("res/data.csv");
				// BufferedOutputStream bs = new BufferedOutputStream(fos); 속도가 더 빠름
				PrintStream out = new PrintStream(fos);// File에 이용한 출력 (시스템 출력을 파일에 기록)

				out.printf("%d,%d,%d\n", kor1, kor2, kor3);
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
			} break;
			
			case 3: {

				// -----------------------------------------
				// 파일 입력
				FileInputStream fis = new FileInputStream("res/data.csv");
				Scanner scanner = new Scanner(fis);

				String str = scanner.nextLine();
				String[] kors = str.split(",");
				
				kor1 = Integer.parseInt(kors[0]); // String -> Int
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);
				fis.close();
				System.out.println("파일 변수 저장 완료");
			}break;
			case 4: {

				// -----------------------------------------

				total = kor1 + kor2 + kor3;
				avg = total / 3.0;// 묵시 형변환

				// 시스템 출력
				System.out.println("┌───────────────────┐");
				System.out.println("│      성적 출력       │");
				System.out.println("└───────────────────┘\n");
				for (int i = 0; i < 3; i++) {
					
				System.out.printf("-------%d-------\n", 3-i);
				System.out.print(total + "\n");
				System.out.print(avg + "\n");
				System.out.println("국어1 :" + kor1);
				System.out.printf("국어2 :%3d\n", kor2);
				System.out.println("국어3 :" + kor3);
				System.out.println("총점 :" + total);
				System.out.printf("평균 :%f\n", avg);
				System.out.printf("평균 :%6.2f\n", avg); // 총 6자리(.포함).이후 자리
				}
				
			}break;

			case 5: {

				// ------------------------------------------------------

				System.out.println("계속 하시겠습니까?(1)종료(0)");

				Scanner scanner = new Scanner(System.in);

//			try {
//				answer = scan.nextInt();
//
//			} catch (Exception e) {
//				answer = 1;
//
//			}

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
				
			}break;

			default: {
				System.out.println("1~5입력값이 아닙니다. 종료");
			}break CHK1;
			
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
