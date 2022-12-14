package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("res/ex1data.txt");
		PrintStream out = new PrintStream(fos);

		out.print("20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 ");
		fos.close();

		
		{
			int count = 0;
			int max = -1;
			int index = -1;
			FileInputStream fis = new FileInputStream("res/ex1data.txt");
			Scanner scan = new Scanner(fis);
			int num = 0;
			int temp = 0;
			do {
				temp = scan.nextInt();
				num += temp;
				if (temp == 10) {
					index = count;
				}
				if (temp > max) {
					max = temp;
				}
				count++;

			} while (num != 600);
			System.out.printf("count is %d\n", count);
			System.out.printf("max is %d\n", max);
			System.out.printf("index is %d\n", index);
			fis.close();
		}
		
		
//		문제 3 : 이 값들 중에 10 을 찾아서 그 위치(인덱스 값)을 출력하시오.
		
		{
			FileInputStream fis = new FileInputStream("res/ex1data.txt");
			Scanner scan = new Scanner(fis);
			int num = 0;
			int index = -1;
			for (int i = 0; i < 15; i++) {
				num = scan.nextInt();
				if (num == 10) {
					index = i;
					break;
				}
			}
			System.out.printf("index is %d\n", index);
			fis.close();
		}

	}
}
