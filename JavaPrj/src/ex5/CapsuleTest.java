package ex5;

public class CapsuleTest {

	public static void main(String[] args) {
		// 성적 객체를 준비한다.		
		Exam exam1 = new Exam();
		Exam exam2 = new Exam(10, 20, 30);
		
		// 성적을 입력 받는다.
		exam1.input();
		
		// 성적을 출력한다.

		exam1.print();
		exam1.print('〓');
		exam1.print('〓', 30);
	}


}
