package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ArTest4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		문제 7 : 다음 각 절차를 따라 작성하시오.
		// 1. res/map.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
		{
//		00010
//		01010
//		00000
		FileOutputStream fos = new FileOutputStream("res/map.txt");
		PrintStream ps = new PrintStream(fos);
		ps.print("00010\r\n" + "01010\r\n" + "00000");
		ps.close();
		fos.close();
		
		}
		// 2. map이라는 이름으로 5x3 크기의 정수를 담을 수 있는 이차원 배열과 board라는 이름의 10X6크기의 문자를 담을 수 있는 이차원 배열을 생성하시오.

		int[][] map = new int[3][5];
		char[][] board = new char[6][10];

		// 3. res/map.txt에서 읽은 데이터로 map 배열을 채우시오.

		{
			FileInputStream fis = new FileInputStream("res/map.txt");
			Scanner scan = new Scanner(fis);
			
		    // 코드를 작성하는 공간
			for (int i = 0; i < map.length; i++) {
				String str1 = scan.nextLine();
				for (int j = 0; j < map[i].length; j++) {
					String[] str2 = str1.split("");
					map[i][j] = Integer.parseInt(str2[j]);
				}
			}  
			
			// 입력 값 확인
			printArray(map);
			
		    System.out.println("map 데이터 로드 완료");
		}

		// 4. map 데이터 하나는 board 배열의 4칸과 대응되며 다음과 같은 모양으로 대응된다.
		// map에서 0은 다음 모양과 같다.
		// ┌ ┐
		// └ ┘
		// map에서 1은 다음 모양과 같다.
		// ▩▩
		// ▩▩
		// map에서 읽은 데이터를 이용해서 board 배열을 채우시오.  다음은 board 배열에 채워진 
		// 모습니다.
		// ┌ ┐┌ ┐┌ ┐▩▩┌ ┐
		// └ ┘└ ┘└ ┘▩▩└ ┘
		// ┌ ┐▩▩┌ ┐▩▩┌ ┐
		// └ ┘▩▩└ ┘▩▩└ ┘
		// ┌ ┐┌ ┐┌ ┐┌ ┐┌ ┐
		// └ ┘└ ┘└ ┘└ ┘└ ┘

		{
		     for (int i= 0, y = 0 ; i < map.length; i++, y+=2) {
				for (int j = 0, x = 0; j < map[i].length; j++, x+=2) {
					if(map[i][j] == 0) {
						board[y][x] = '┌';
						board[y][x+1] = '┐';
						board[y+1][x] = '└';
						board[y+1][x+1] = '┘';
					} else {
						board[y][x] = '▩';
						board[y][x+1] = '▩';
						board[y+1][x] = '▩';
						board[y+1][x+1] = '▩';
					}			
				}
			}



		    System.out.println("board 그리기 완료");
		}

		// 5. board 배열을 화면에 출력하는 코드를 작성하시오.
		
		{
		     // 코드를 작성하는 공간
			printArray(board);


		    System.out.println("board 출력 완료");
		}

	}

	private static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	//오버 로딩
	private static void printArray(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
