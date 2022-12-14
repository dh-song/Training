package ex1.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest2Sort {

	public static void main(String[] args) throws FileNotFoundException {
		// 1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
		int nums[] = new int[15];

		// 2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다.
		{
			FileInputStream fis = new FileInputStream("res/data.txt");
			Scanner sc = new Scanner(fis);
//					int i = 0;
//					while (sc.hasNext()) {
//						nums[i] = sc.nextInt();
//						i++;
//					}
			for (int i = 0; i < 15; i++) {
				nums[i] = sc.nextInt();
			}

			sc.close();
			
			for ( int i : nums) {
				System.out.printf("%d ", i);
			}
			
			System.out.println();
			System.out.println("로드 완료");
		}

		// 3. 0~14 범위의 랜덤값 2개를 얻어서 그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
		{
			// 코드를 작성하는 공간
			Random ran = new Random();
			for (int i = 0; i < 50; i++) {
				int f = ran.nextInt(15);
				int s = ran.nextInt(15);
				int temp = nums[f];
				nums[f] = nums[s];
				nums[s] = temp;
			}
			for ( int i : nums) {
				System.out.printf("%d ", i);
			}
			
			System.out.println();
			System.out.println("번호 섞기 완료");
			
			
			
		}

		// 4. res/data-out.txt 파일로 배열의 값들을 저장
		{
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			for (int i = 0; i < 15; i++) {
				out.printf("%d ", nums[i]);
			}
			out.flush();
			out.close();
			
			
			System.out.println("저장 완료");
		}
		
		// sort
		{
			for (int j = 0; j < 15 - 1; j++) {
				for (int i = 0; i < (15 - 1) - j; i++) {
					if (nums[i] > nums[i + 1]) {
						int temp = nums[i];
						nums[i] = nums[i + 1];
						nums[i + 1] = temp;
					}
				}
			}
			
			

			for (int i : nums) {
				System.out.printf("%d ", i);
			}

			System.out.println();
			System.out.println("정렬 완료");

		}
	}
}