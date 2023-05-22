package ex9.exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program2 {
    public static void main(String[] args) {

        
        
        
        try (
            FileOutputStream fos = new FileOutputStream("JavaPrj/res/data3.txt");
            PrintStream out  = new PrintStream(fos);
        ){
            out.println("hihihi hohohoho");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 


        // Calculator calc = new Calculator();

        // int result;
        // try {

        //     result = calc.add(-100, 2);
        //     // TODO Auto-generated catch block

        // } catch (massNum e) {
        //     System.out.println("숫자 너무 큼");

        //     e.printStackTrace();
        // } catch (negativeNum e) {
        //     System.out.println("음수 ㄴㄴ");
        //     e.printStackTrace();
        // } finally{
        //     System.out.println("공통 출력");
        // }
       

    }
}
