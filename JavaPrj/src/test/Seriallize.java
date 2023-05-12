package test;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Seriallize {
    
    public static void main(String[] arges) throws IOException {
        Testobj tob = new Testobj(1, 2, 3);
        FileOutputStream fos = new FileOutputStream("res/data1.txt");

        // DataOutput dos = new DataOutputStream(fos);
        // dos.writeInt(tob.kor);

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tob);

        fos.close();
    }
}
