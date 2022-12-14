package ex1.test;


public class OmikTest {

	public static void main(String[] args) {
		
		System.out.printf("%c", '┌');
		for (int t = 1; t <= 10; t++) {
			System.out.printf("%c", '┬');
		}
		System.out.printf("%c", '┐');
		System.out.println();
//		-------------상단
		for (int y = 1; y <= 10; y++) {
			System.out.printf("%c", '├'); //왼쪽
			
			for (int x = 1; x <= 10; x++) //내용
				if(x == 3 && y ==3 )
					System.out.printf("%c", '⊙');
				else
					System.out.printf("%c", '┼');
			
			System.out.printf("%c", '┤'); //오른쪽
			System.out.println();		
		}

//		-------------하단
		System.out.printf("%c", '└');
		for (int t = 1; t <= 10; t++) {
			System.out.printf("%c", '┴');
		}
		System.out.printf("%c", '┘');
		System.out.println();
		
//			System.out.printf("%c", '┬');
		
		
////----------------------------------------
//			for ( int i = 0; i < 100; i++) {
//				
//				if()
//					System.out.printf("%c", '◎');
//				else
//					System.out.printf("%c", '┼');
//				
//				if (i%10 == 9) {
//					System.out.println();
//				}
//				
//		}


	}
}
