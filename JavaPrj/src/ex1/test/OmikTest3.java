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

			for (int y = 1; y <= 10; y++) { // 출력
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
			//돌 중복
			
			if (board[oy][ox]=='●' || board[oy][ox]=='○') {
				System.out.println("이미 돌이 존재합니다.");
				continue;
			}

			{//흑백
				if (cr == true) {
					board[oy][ox] = '●';
				} else {
					board[oy][ox] = '○';
				} cr = !cr;
			}
			
//				cr ? board[oy][ox] = '●' : board[oy][ox] = '○';
			

			{
				// win 변수로 while break 후 끝단에서 한번 더 체크로 종료와 승리 표시
				// 가로 세로 대각선 20가지 승리 경우의 수로 win 값 생성
				// 흑백 boolean 임시 변수로 win 값 생성 경우의 수 비교에 활용
				
				
				
				
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

