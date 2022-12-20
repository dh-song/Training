package ex6.has_a;

public class CapsuleTest {

	public static void main(String[] args) {
		// 성적 객체를 준비한다.		
		Exam exam1 = new Exam();
		Exam exam2 = new Exam(10, 20, 30);
		
		ExamConsole console = new ExamConsole(); //생성과 함께 exam 초기화 = 컴포지션
//		console.setExam(exam1);따로만들기 = 어소시에이션
		console.input();
		console.print();
		// 성적을 입력 받는다.
//		exam1.input();
//		
//		// 성적을 출력한다.
//
//		exam1.print();
//		exam1.print('〓');
//		exam1.print('〓', 30);
	}


}
