package test;

public class Canvas {
	
	private char[][] buf;
	
	public Canvas() {
		buf = new char[20][20];
		for (int i = 0; i < buf.length; i++) {
			for (int j = 0; j < buf[0].length; j++) {
				buf[i][j]= '┼';
			}
		}
	}
	public void drawLine(int x, int y, char p, int n) {

		if (p == '-') {
			for (int i = 0; i < n; i++) {
				buf[y - 1 + i][x - 1 + i] = '○';
			}
		} else if (p == '+') {
			for (int i = 0; i < n; i++) {
				buf[y - 1 - i][x - 1 + i] = '○';

			}
		}
		printArray();
	}
	
	void printArray() {
		for (int i = 0; i < buf.length; i++) {
			for (int j = 0; j < buf[i].length; j++) {
				System.out.print(buf[i][j]);
			}
			System.out.println();
		}
		System.out.println("출력 완료");
		
	}
}
