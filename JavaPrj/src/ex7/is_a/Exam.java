package ex7.is_a;

public class Exam {
	private int kor;
	private int eng;
	private int math;

	public Exam() { // new 생성자, 초기화
//		kor=30; 불가능
		this(0, 0, 0); //생성자는 이름이 없기 때문에 this 사용 ,오버로드 생성자 호출
//		kor=30; 생성된 후라 가능
	}
	
	public Exam(int kor, int eng, int math) { //생성자 오버로드
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	public double avg() {
		return total() / 3.0;
	}

	public int total() {
		return kor + eng + math ;

}

	public void setKor(int kor) {
		this.kor = kor;
		
	}

	public void setEng(int eng) {
		this.eng = eng;
		
	}

	public void setMath(int math) {
		this.math = math;
		
	}

	public int getKor() {
		// TODO Auto-generated method stub
		return kor;
	}

	public int getEng() {
		// TODO Auto-generated method stub
		return eng;
	}

	public int getMath() {
		// TODO Auto-generated method stub
		return math;
	}
}
