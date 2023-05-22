package ex9.stream;

public class Exam implements Comparable<Exam> {
   private int id;
   private int kor;
   private int eng;
   private int math;

   public Exam() {
      // TODO Auto-generated constructor stub
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getKor() {
      return kor;
   }

   public void setKor(int kor) {
      this.kor = kor;
   }

   public int getEng() {
      return eng;
   }

   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getMath() {
      return math;
   }

   public void setMath(int math) {
      this.math = math;
   }

   public static Exam fromCSV(String csv) {
      Exam exam = new Exam();
      String[] tokens = csv.split(",");
      exam.setId(Integer.parseInt(tokens[0]));
      exam.setKor(Integer.parseInt(tokens[1]));
      exam.setEng(Integer.parseInt(tokens[2]));
      exam.setMath(Integer.parseInt(tokens[3]));
      // int id = Integer.parseInt(tokens[0]);
      // int kor = Integer.parseInt(tokens[1]);
      // int eng = Integer.parseInt(tokens[2]);
      // int math = Integer.parseInt(tokens[3]);

      
      return exam;
   }

   @Override
   public String toString() {
      return "Exam [id=" + id + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
   }

   @Override
   public int compareTo(Exam o) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
   }

}