package ex1.test;

public class StringTest {

	public static void main(String[] args) {
		
		 String str = "sdfsdf";
		 String str2 = "sdfsdf";
		 String str3 = new String("sdfsdf");
		 
		 if (str == str2) {
			System.out.println("같 1");
		}
		 if (str == str3) {
			 System.out.println("같 2");
		}
		 if (str.equals(str3)) {
			 System.out.println("같 3");
		}

	}

}
