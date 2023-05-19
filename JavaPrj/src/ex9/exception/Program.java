package ex9.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = null;
        PrintStream out = null;
        
        try {
            fos = new FileOutputStream("/JavaPrj/res/data3.txt");
            out = new PrintStream(fos);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try {
                fos.close();
                out.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
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
