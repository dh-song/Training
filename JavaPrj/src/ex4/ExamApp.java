package ex4;


public class ExamApp {

	public static void main(String[] args) {
			
		Exam exam1 = new Exam();
		exam1.kor = 60;
		exam1.eng = 70;
		exam1.math = 80;
		
		printExam(exam1);
		
		
		Exam[] exams = new Exam[3];
		
		exams[0] = new Exam();
		exams[0].kor = 10;
		exams[0].eng = 20;
		exams[0].math = 30;
		
		exams[1] = new Exam();
		exams[1].kor = 40;
		exams[1].eng = 50;
		exams[1].math = 60;
		
		exams[2] = new Exam();
		exams[2].kor = 70;
		exams[2].eng = 80;
		exams[2].math = 90;

		printExams(exams);
	}

	private static void printExams(Exam[] a) {
		
		for (int i = 0; i < a.length; i++) {
			Exam exam = a[i];
			printExam(exam);
		}
		
	}

	private static void printExam(Exam a) {
		System.out.printf("kor: %d\n", a.kor);
		System.out.printf("eng: %d\n", a.eng);
		System.out.printf("math: %d\n", a.math);
		System.out.println("-------------");
	}

}
