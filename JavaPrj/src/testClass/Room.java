package testClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Room {

	private Student[] students;
	private int studentNum;
	
	
	public void load(String str) throws IOException {

		studentNum = studentNum(str);
		students = new Student[studentNum];
		
		FileInputStream fis = new FileInputStream(str);
		Scanner scan = new Scanner(fis);
		scan.nextLine();
		
		for (int i = 0; i < students.length; i++) {
			String stdInfo = scan.nextLine();
			String[] stdInfos = stdInfo.split(",");
			students[i] = new Student(); // 배열만 생성했으니 배열 속 객체를 초기화 해줘야 한다.
			students[i].setId(Integer.parseInt(stdInfos[0]));
			students[i].setName(stdInfos[1]);
		}
		scan.reset();
		fis.close();
		System.out.println("로드완료");
		
	}
	public int studentNum(String str) throws IOException {
		
		FileInputStream fis = new FileInputStream(str);
		Scanner scan = new Scanner(fis);
		int studentNum = 0;
		while (scan.hasNext()) {
			studentNum++;
			scan.nextLine();
		}
		studentNum--;
		fis.close();
		return studentNum;
	}

	public void shuffle() {
		
		Random ran = new Random();
		for (int i = 0; i < 50; i++) {
			int f = ran.nextInt(studentNum);
			int s = ran.nextInt(studentNum);
			Student temp = students[f];
			students[f] = students[s];
			students[s] = temp;
		}
		System.out.println("섞기 완료");
		
	}

	public void print() {
		print('-');
		
	}
	
	public void print(char ch) {
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		for (int i = 0; i < 30; i++) {
			System.out.printf("%c", ch);
		}
		System.out.println();
		
		
	}

	public void sort() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if (students[j].getId() > students[j+1].getId()) {
					Student temp = students[j];
					students[j] = students[j+1];
					students[j+1] = temp;
				}
				
			}
		}
		
	}
	
	public void sort(char ch){
		if (ch == '-') {
			for (int i = 0; i < students.length; i++) {
				for (int j = 0; j < students.length-1; j++) {
					if (students[j].getId() < students[j+1].getId()) {
						Student temp = students[j];
						students[j] = students[j+1];
						students[j+1] = temp;
					}
					
				}
			}
		}

		
	}



}
