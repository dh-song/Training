package test;

import java.io.Serializable;

public class Testobj implements Serializable{
    int kor;
    int eng;
    int math;

    public  Testobj() {
        
    }

    public Testobj(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int total() {
        int result = 0;
        result = kor + eng + math;
        return result;
    }
}
