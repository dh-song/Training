package ex7.is_a;

public class NewlecExam extends Exam{
	private int com;

	public NewlecExam() {
//		super();
//		this.com = com; //순서 중요 상위 먼저
		this(0, 0, 0, 0);
		
	}

	public NewlecExam(int kor, int eng, int math, int com) {
		super(kor, eng, math);
		this.com = com;
	}
	
	@Override
	public int total() {
		
		return super.total()+com;
	}
	@Override
	public double avg() {
		
		return total() / 4;
	}
}
