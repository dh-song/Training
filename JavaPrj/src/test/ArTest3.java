package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArTest3 {

	public static void main(String[] args) throws IOException {


		// 1. res/bitmap.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
//		{
//		FileOutputStream fos = new FileOutputStream("res/bitmap.txt");
//		PrintStream ps = new PrintStream(fos);
//		
//		ps.print("11111111110000000000\r\n"
//				+ "11111111100000000000\r\n"
//				+ "11111111000000000000\r\n"
//				+ "11111110000000000000\r\n"
//				+ "11111100000000000000\r\n"
//				+ "11111000000000000000\r\n"
//				+ "11110000000000000000\r\n"
//				+ "11100000000000000000\r\n"
//				+ "11000000000000000000\r\n"
//				+ "10000000000000000000");
//		
//
//		}
		// 2. bitmap이라는 이름으로 20X10크기의 정수를 담을 수 있는 이차원 배열을 생성하시오.

		int[][] bitmap = new int[10][20];

		{
			FileInputStream fis = new FileInputStream("res/bitmap.txt");
			Scanner scan = new Scanner(fis);

			for (int i = 0; i < 10; i++) {
				String str1 = scan.nextLine();
				for (int j = 0; j < 20; j++) {
					String[] str2 = str1.split("");
					bitmap[i][j] = Integer.parseInt(str2[j]);
				}
			}

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					System.out.print(bitmap[i][j]);
				}
				System.out.println();
			}

//		System.out.println("파일 불러오기 완료");

		}

//		3. 다음 그림과 같은 모양이 되도록 값의 위치를 변경하시오

		{
			// 코드를 작성하는 공간
			// 끝단 0은 스킵
			for (int i = 0, in = 9; i < bitmap.length; i++, in--) {
				for (int j = 0, jn = 19; j < 10 ; j++, jn--) {
					if (bitmap[i][j] != bitmap[i][jn]) {
						int tmp = bitmap[i][j];
						bitmap[i][j] = bitmap[i][jn];
						bitmap[i][jn] = tmp;
					} else {
						break;
					}
				}
			}

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					System.out.print(bitmap[i][j]);
				}
				System.out.println();
			}

			System.out.println("자리변경 완료");
		}

		// 4. res/bitmap-out.txt 파일로 bitmap 배열의 값들을 저장
		{
			// 코드를 작성하는 공간
			FileOutputStream fos = new FileOutputStream("res/bitmap.txt");
			PrintStream ps = new PrintStream(fos);

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 20; j++) {
					ps.print(bitmap[i][j]);
				}
				if (i != 9) {
					ps.println();
				}
			}

			fos.close();
			System.out.println("저장 완료");
		}
	}
}
