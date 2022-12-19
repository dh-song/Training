package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ArTest5 {

	public static void main(String[] args) throws IOException {
	
	{
//		파일 위치, 입력 값
		writeFile("res/map.txt", "00010\r\n" + "01010\r\n" + "00000");

	}

//		입력 받은 파일의 최대 문자 길이만큼 생성
	int[][] map = createArray("res/map.txt");

//		입력받은 배열의 2배 생성
	char[][] board = createDoubleArray(map);

	{
		
//		파일 값 변수에 넣기
		loadFile(map, "res/map.txt");

// 		입력 값 출력
		printArray(map);

	}

	{
//		첫 배열이용 두번째 배열로 출력
		printBoard(map, board);
		
//		과제와 다른 문자로 변경
		printBoard(map, board, '↖', '↗', '↙', '↘', '▧', '▨', '▤', '▥');

	}

	// 5. board 배열을 화면에 출력하는 코드를 작성하시오.

	{
		printArray(board);

	}
}
	

	private static char[][] createDoubleArray(int[][] map) {
		int y = map.length * 2;
		int x = map[0].length * 2;
		char[][] board = new char[y][x];
		return board;
	}

	// -----------------------------------함수 구역

	private static int[][] createArray(String str) throws IOException {
		FileInputStream fis = new FileInputStream(str);
		Scanner scan = new Scanner(fis);
		int y = 0;
		int x = 0;
		while (scan.hasNext()) {
			y++;
			String line = scan.nextLine();
			int linenum = line.length();
			if (x < linenum) {
				x = linenum;
			}
		}
		fis.close();
		int[][] map = new int[y][x];

		return map;
	}

	private static void writeFile(String str1, String str2) throws IOException {
		FileOutputStream fos = new FileOutputStream(str1);
		PrintStream ps = new PrintStream(fos);
		ps.print(str2);
		ps.close();
		fos.close();
		System.out.println("파일 생성 완료");

	}

	private static void printBoard(int[][] map, char[][] board) {

		for (int i = 0, y = 0; i < map.length; i++, y += 2) {
			for (int j = 0, x = 0; j < map[i].length; j++, x += 2) {
				if (map[i][j] == 0) {
					board[y][x] = '┌';
					board[y][x + 1] = '┐';
					board[y + 1][x] = '└';
					board[y + 1][x + 1] = '┘';
				} else {
					board[y][x] = '▩';
					board[y][x + 1] = '▩';
					board[y + 1][x] = '▩';
					board[y + 1][x + 1] = '▩';
				}
			}
		}
		printArray(board);
		System.out.println("board 그리기 완료");
	}

	private static void printBoard(int[][] map, char[][] board, char lu1, char ru1, char ld1, char rd1, char lu2,
			char ru2, char ld2, char rd2) {

		for (int i = 0, y = 0; i < map.length; i++, y += 2) {
			for (int j = 0, x = 0; j < map[i].length; j++, x += 2) {
				if (map[i][j] == 0) {
					board[y][x] = lu1;
					board[y][x + 1] = ru1;
					board[y + 1][x] = ld1;
					board[y + 1][x + 1] = rd1;
				} else {
					board[y][x] = lu2;
					board[y][x + 1] = ru2;
					board[y + 1][x] = ld2;
					board[y + 1][x + 1] = rd2;
				}
			}
		}
		printArray(board);
		System.out.println("board 그리기 완료");
	}

	private static void loadFile(int[][] map, String str) throws IOException {
		FileInputStream fis = new FileInputStream(str);
		Scanner scan = new Scanner(fis);

		// 코드를 작성하는 공간
		for (int i = 0; i < map.length; i++) {
			String str1 = scan.nextLine();
			for (int j = 0; j < map[i].length; j++) {
				String[] str2 = str1.split("");
				map[i][j] = Integer.parseInt(str2[j]);
			}
		}
		fis.close();
		System.out.println("map 데이터 로드 완료");

	}

	// 배열 값 출력
	private static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("출력 완료");
	}


	private static void printArray(char[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("출력 완료");
	}

}

