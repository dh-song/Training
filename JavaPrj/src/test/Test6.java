package test;

public class Test6 {

	public static void main(String[] args) {
//		문제 9 : 다음 각 절차를 따라 작성하시오.

		// 1. 다음 한문장을 반복해서 다음과 같은 출력이 가능하도록 하는 코드를 작성하시오.
//		System.out.printf("%c", '┼');
//		System.out.printf("%c", '○');


//		○┼┼┼┼┼┼┼┼┼
//		┼○┼┼┼┼┼┼┼┼
//		┼┼○┼┼┼┼┼┼┼
//		┼┼┼○┼┼┼┼┼┼
//		┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼
//		┼┼┼┼┼┼○┼┼┼
//		┼┼┼┼┼┼┼○┼┼
//		┼┼┼┼┼┼┼┼○┼
//		┼┼┼┼┼┼┼┼┼○
//
		{
		     // 코드를 작성하는 공간
			for (int i = 0; i <=9; i++) {
				for (int j = 0; j <=9; j++) {
					if (j == i) {
						System.out.printf("%c", '○');
					} else {
						System.out.printf("%c", '┼');
					}
					
				}System.out.println();
			} 
		    
//
		    System.out.println("1번 과제 출력 완료");
		}

		// 2. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
		

//		○┼┼┼┼┼┼┼┼┼○
//		┼○┼┼┼┼┼┼┼○┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼○┼┼┼┼┼┼┼○┼
//		○┼┼┼┼┼┼┼┼┼○
//
//		{
		     // 코드를 작성하는 공간
		for (int i = 10; i>=0; i--) {
			for (int j = 0; j <=10; j++) {
				if (j == i || j+i ==10) {
					System.out.printf("%c", '○');
				} else {
					System.out.printf("%c", '┼');
				} 
				
			}System.out.println();
		}
		    

		    System.out.println("2번 과제 출력 완료");
//		}


		// 3. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
//		○┼┼┼┼┼┼┼┼┼○
//		┼○┼┼┼┼┼┼┼○┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼○○○┼┼┼┼
//		┼┼┼○○○○○┼┼┼
//		┼┼○○○○○○○┼┼
//		┼○○○○○○○○○┼
//		○○○○○○○○○○○
//
		{
		     // 코드를 작성하는 공간


		    System.out.println("3번 과제 출력 완료");
		}

}
}