package testClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Memo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/students.csv");
		Scanner scan = new Scanner(fis);
		


		int[] std = new int[12];
		int c = 0;
		while(scan.hasNext()) {
			String stdInfo = scan.nextLine();
			String[] stdfos = stdInfo.split(",");
			try {
				std[c] = Integer.parseInt(stdfos[0]);
				c++;
			} catch (Exception e) {
				continue;
			}

		}
		
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}
		
		
//		for (int i = 0; i < students.length; i++) {
//			String stdInfo = scan.nextLine();
//			String[] stdfos = stdInfo.split(",");
//			students[i] = new Student(); // 배열만 생성했으니 배열 속 객체를 초기화 해줘야 한다.
//			students[i].setId(Integer.parseInt(stdfos[0]));
//			students[i].setName(stdfos[1]);
//		}
		scan.reset();
		fis.close();

	}

}
