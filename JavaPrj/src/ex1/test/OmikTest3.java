package ex1.test;

import java.util.Scanner;

public class OmikTest3 {

	public static void main(String[] args) {

		char[][] board = new char[10][10];

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				board[y - 1][x - 1] = '┼';
//				System.out.printf("%c", board[i][j]);
			}
		}

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				board[0][x - 1] = '┬';
				board[10 - 1][x - 1] = '┴';
				if (x == 1) {
					board[0][x - 1] = '┌';
					board[y - 1][x - 1] = '├';
					board[10 - 1][x - 1] = '└';
				}
				if (x == 10) {
					board[0][x - 1] = '┐';
					board[y - 1][x - 1] = '┤';
					board[10 - 1][x - 1] = '┘';

				}
//				System.out.printf("%c", board[i][j]);
			}
		}

//		board[44] = '○';
//		board[(5 - 1) * 10 + (6 - 1)] = '○';
		{
			
		for (int y = 1; y <= 10; y++) { //출력
			for (int x = 1; x <= 10; x++) {
				System.out.printf("%c", board[y - 1][x - 1]);
			}
			System.out.println();
		}
		
		}
		
		int end = 1;
		boolean cr = true;
		while (end == 1) {
			
			int ox, oy;
			Scanner scan = new Scanner(System.in);

			System.out.print("가로 칸: >");
//		ox = scan.nextInt() - 1;
			while (true) {
				try {
					ox = scan.nextInt() - 1;
					if (ox < 0 || ox > 9) {
						System.out.print("1~10의 숫자를 입력하세요. 가로 칸: >");
						continue;
					}
				} catch (Exception e) {
					scan.nextLine();
					System.out.print("1~10의 숫자를 입력하세요. 가로 칸: >");
					continue;
				}
				break;

			}

			System.out.print("세로 칸: >");
//		oy = scan.nextInt() - 1;
			while (true) {
				try {
					oy = scan.nextInt() - 1;
					if (oy < 0 || oy > 9) {
						System.out.print("1~10의 숫자를 입력하세요.\n 세로 칸: >");
						continue;
					}
				} catch (Exception e) {
					scan.nextLine();
					System.out.print("1~10의 숫자를 입력하세요.\n 세로 칸: >");
					continue;
				}
				break;

			}
			
			if (cr == true) {
				board[oy][ox] = '●';
				cr = false;			
			} else {
				board[oy][ox] = '○';
				cr = true;
			}
		
			{

				for (int y = 1; y <= 10; y++) { // 출력
					for (int x = 1; x <= 10; x++) {
						System.out.printf("%c", board[y - 1][x - 1]);
					}
					System.out.println();
				}

			}
			System.out.print("종료(0), 계속(1)>");
			end = scan.nextInt();

		}
		cr = true;
		System.out.println("ㅂㅂ");
	}
}
