package ex1.test;

import java.util.Scanner;

public class OmikTest3 {
	

	public static void main(String[] args) {

		char[][] board = new char[10][10];

		initBoard(board);

		printBoard(board);



		int end = 1;
		boolean cr = true;
		int winc = 0;
		Scanner scan = new Scanner(System.in);
		int ox, oy;
		HOME:
		while (end == 1) {

			
			
			
			
			inputOmockOnBoard();
			
			System.out.print("가로 칸: >");
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
			

			
			printBoard(board);
			
			
			
			{
				// winc 변수로 메인 반복문 break 후 끝단에서 한번 더 체크로 종료와 승리 표시
				// 가로 세로 대각선 20가지 승리 경우의 수
				// false 면 break 방식
				// 가로ox 세로oy 판board[oy][ox]
				
				//가로
				
				for (int j = 0; j < 5; j++) {
					for (int i = 1; i < 5 ; i++) {
						if(ox-j >= 0 && ox-j < 10 && ox-j+i >= 0 && ox-j+i < 10) {
							if(board[oy][ox-j] != board[oy][ox-j+i]) {
								winc = 0;
								break;
							}winc ++; //확인
							if (winc == 4) {
								break HOME;
								}
						} else {
							winc = 0;
							break;
						}	
					}
				}
				
				//세로

				for (int j = 0; j < 5; j++) {
					for (int i = 1; i < 5 ; i++) {
						if(oy-j >= 0 && oy-j < 10 && oy-j+i >= 0 && oy-j+i < 10) {
							if(board[oy-j][ox] != board[oy-j+i][ox]) {
								winc = 0;
								break;
							}winc ++; //확인
							if (winc == 4) {
								break HOME;
								}
						} else {
							winc = 0;
							break;
						}	
					}
				}

				// 대각선 상승
				
				for (int j = 0; j < 5; j++) {
					for (int i = 1; i < 5; i++) {
						
						if (oy + j >= 0 
								&& oy + j < 10 
								&& ox - j >= 0 
								&& ox - j < 10 
								&& oy + j - i >= 0
								&& oy + j - i < 10 
								&& ox - j + i >= 0 
								&& ox - j + i < 10) {
							
							if (board[oy + j][ox - j] != board[oy + j - i][ox - j + i]) {
								winc = 0;
								break;
							}
							winc++; // 확인
							if (winc == 4) {
								break HOME;
							}
						} else {
							winc = 0;
							break;
						}
					}
				}
				
				// 대각선 하락
				
				for (int j = 0; j < 5; j++) {
					for (int i = 1; i < 5; i++) {
						
						if (oy - j >= 0 
								&& oy - j < 10 
								&& ox - j >= 0 
								&& ox - j < 10 
								&& oy - j + i >= 0
								&& oy - j + i < 10 
								&& ox - j + i >= 0 
								&& ox - j + i < 10) {
							
							if (board[oy - j][ox - j] != board[oy - j + i][ox - j + i]) {
								winc = 0;
								break;
							}
							winc++; // 확인
							if (winc == 4) {
								break HOME;
							}
						} else {
							winc = 0;
							break;
						}
					}
				}
				
				
				
				
				
			}
				
			System.out.print("종료(아무숫자), 계속(1)>");
			end = scan.nextInt();

		}
		if (winc == 4) {
			if(cr==true) {
				System.out.println("○ 승리");
			} else if(cr==false) {
				System.out.println("● 승리");
			}
			
		} else {
		System.out.println("ㅂㅂ");
		}
	}

private static void inputOmockOnBoard() {
		// TODO Auto-generated method stub
		
	}

//	------------------------------------------------------매서드
	private static void printBoard(char[][] board) {
		for (int y = 1; y <= 10; y++) { // 출력
			for (int x = 1; x <= 10; x++) {
				System.out.printf("%c", board[y - 1][x - 1]);
			}
			System.out.println();
		}
	}

	private static void initBoard(char[][] board) {
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				board[y - 1][x - 1] = '┼';
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
			}
		}
		System.out.println("초기화 완료");
	}
		
	
}

