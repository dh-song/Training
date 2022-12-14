import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exc {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		int x = '1' + 1;
		System.out.println(x);
		char b = 'a';
		System.out.println(b);
		
		int i = 1;
		
		System.out.println(i++);
		System.out.println(++i);
		
		//출력
		BufferedOutputStream bs = null;
		bs = new BufferedOutputStream(new FileOutputStream("C:/Users/ict26/Desktop/test.txt"));
		String str = "안녕하세요. 아무튼 생성됨";
		bs.write(str.getBytes());
		bs.close();	
		
		//입력
		String path ="C:/Users/ict26/Desktop/test.txt";
		FileInputStream fileStream = null;
		fileStream = new FileInputStream(path);
		
		byte[] readBuffer = new byte[fileStream.available()];
		while (fileStream.read(readBuffer)!= -1){}
		System.out.println(new String(readBuffer));
		fileStream.close();
		
	}

}
