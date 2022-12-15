package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ArTest2 {

	public static void main(String[] args) throws IOException {
		// 1. res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
		// abcdefghijklmn

		// 2. alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
		char[] alphabet = new char[15];

		// 3. res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다.
		{
			FileInputStream fis = new FileInputStream("res/alphabet.txt");

			for (int i = 0; i < 15; i++) {
				alphabet[i] = (char) fis.read();
			}
			fis.close();
			System.out.println("로드 완료");
		}
		
		
		for (char c : alphabet) {
			System.out.print(c);
		}
		System.out.println();

		// 3. 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.
//	    nmlkjihgfedcba

		{
			for (int i = 0, j = 13; i < 7; i++, j--) {
				char tmp = alphabet[i];
				alphabet[i] = alphabet[j];
				alphabet[j] = tmp;
			}
			System.out.println("자리변경 완료");
		}
//		----------------------------------------------------------------

		for (char c : alphabet) {
			System.out.print(c);
		}
		System.out.println();

		// 4. res/alphabet-out.txt 파일로 배열의 값들을 저장
		{
			FileOutputStream fos = new FileOutputStream("res/alphabet.txt");
			PrintStream ps = new PrintStream(fos);
			for (char c : alphabet) {
				ps.print(c);
			}
			System.out.println("저장 완료");
		}
//		----------------------------------------------------------------
		
		FileInputStream fis = new FileInputStream("res/alphabet.txt");

		for (int i = 0; i < 14; i++) {
			alphabet[i] = (char) fis.read();
		}

		for (char c : alphabet) {
			System.out.print(c);
		}
		System.out.println();
		fis.close();

	}
}
