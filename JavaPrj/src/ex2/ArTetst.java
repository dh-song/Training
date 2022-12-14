package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


public class ArTetst {

	public static void main(String[] args) throws IOException {

//		문제 4 : 다음 각 절차를 따라 작성하시오.

		// 1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
		int[] nums = new int[15];

		// 2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다. 
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner scan = new Scanner(fis);

//		    while 버전
//		    int count = 0;
//		    while (scan.hasNext()) {
//				nums[count] = scan.nextInt();
//				count++;
//			}

			for (int i = 0; i < 15; i++) {
				nums[i] = scan.nextInt();
			}
			
			fis.close();
			System.out.println("로드 완료");

			for (int i = 0; i < 15; i++) {
				System.out.printf("%d ", nums[i]);
			}
			System.out.println();
		}

		// 3. 0~14 범위의 랜덤값 2개를 얻어서  그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
		{
			Random rd = new Random();
			for (int n = 1; n <= 50; n++) {
				int rdnum1 = rd.nextInt(15);
				int rdnum2 = rd.nextInt(15);

				int tmp = nums[rdnum1];
				nums[rdnum1] = nums[rdnum2];
				nums[rdnum2] = tmp;
			}

			System.out.println("번호 섞기 완료");
		}

		// 4. res/data-out.txt 파일로 배열의 값들을 저장 
		{
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream ps = new PrintStream(fos);

			for (int i = 0; i < 15; i++) {
				ps.printf("%d ", nums[i]);
				System.out.printf("%d ", nums[i]);
			}
			
			System.out.println();
			fos.flush();
			fos.close();
			System.out.println("저장 완료");
		}

	}

}
