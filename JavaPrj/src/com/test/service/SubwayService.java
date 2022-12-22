package com.test.service;

import java.util.Scanner;

public class SubwayService { // 주석은 1차 배열 코드, 유효성 검사는 안 함.
	int curStation;
	int[][] subs; // 2중배열 사용
//	int[] sub1;
//	int[] sub2;
//	int[] sub3;
//	int[] sub4;

	

	public SubwayService() {

		curStation = 1;

//		sub1 = new int[4];
//		sub2 = new int[4];
//		sub3 = new int[4];
//		sub4 = new int[4];

		subs = new int[4][4]; // 2중배열 사용
	}

	public void run() {

		System.out.println("=================================");
		System.out.println("현재역은 [" + stationName(curStation) + "]입니다.");
		System.out.println("=================================");
		int pOutNum = passOut(); // run 화면 로딩 시 해당 역 내리는 인원 0이 아니면 이번 역 하차 출력
		if (pOutNum != 0) { 
			System.out.printf("이번역 하차 인원: %d\n", pOutNum);
		}
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.탑승 2.상세보기 3.이동 9.종료");
		Scanner scan = new Scanner(System.in);

		switch (scan.nextInt()) {
		case 1:
			join();
			break;
		case 2:
			status();
			break;
		case 3:
			move(); // 역을 숫자로 관리, 이동은 +1, 이름 String은 switch 로 대입
			break;
		case 9:
			System.out.println("열차운행을 종료합니다.");
			break;
		default:
			System.out.println("잘못입력하였습니다.");

		}

	}

	private int passOut() {

		int passOutNum = 0;

		// 2중배열로 짧아진 코드
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (subs[i][j] == curStation) {
					subs[i][j] = 0;
					passOutNum++;
				}
			}
		}

//		for (int i = 0; i < 4; i++) {
//			if (sub1[i] == curStation) {
//				sub1[i] = 0;
//				passOutNum++;
//			}
//			if (sub2[i] == curStation) {
//				sub2[i] = 0;
//				passOutNum++;
//			}
//			if (sub3[i] == curStation) {
//				sub3[i] = 0;
//				passOutNum++;
//			}
//			if (sub4[i] == curStation) {
//				sub4[i] = 0;
//				passOutNum++;
//			}
//		}

		return passOutNum;
	}

	private void join() { // 탑승 처리 단계

		System.out.println("----탑승가능현황----");
		System.out.println("현재역은 " + stationName(curStation) + "입니다.");
		
		for (int i = 0; i < 4; i++) {
			if (passNum(i) != 4) { // 4개의 열차칸에 인원 수를 확인
				System.out.println((i + 1) + "호 차: 탑승 가능");
			} else {
				System.out.println((i + 1) + "호 차: 탑승 불가능");
			}
		}
		System.out.println("어느 열차에 탑승하시겠습니까?");
		Scanner scan = new Scanner(System.in);
		System.out.println("1.(1호 차) 2.(2호 차) 3.(3호 차) 4.(4호 차)");
		int subNum = scan.nextInt();
		if (passNum(subNum - 1) == 4) {
			System.out.println(subNum + "번 열차 탑승 불가능 합니다.");
			run();
		}

		printStation(); // 역 출력 (당 역 제외)
		System.out.println();
		int stNum = scan.nextInt();
		passIn(subNum, stNum); // 선택 열차 배열에 인원 수 증가

	}

	private void printStation() {
		for (int i = 0; i < 5; i++) {
			if (curStation - 1 != i) {
				System.out.printf("%d.(%s) ", i + 1, stationName(i));
			}
		}

	}

	private void passIn(int subNum, int stNum) {

		// 2중배열로 짧아진 코드
		for (int i = 0; i < 4; i++) {
			if (subs[subNum - 1][i] == 0) {
				subs[subNum - 1][i] = stNum;
				break;
			}
		}

//		switch (subNum) {
//		case 1:
//			for (int i = 0; i < 4; i++) {
//				if (sub1[i] == 0) {
//					sub1[i] = stNum;
//					break;
//				}
//			}
//			break;
//
//		case 2:
//			for (int i = 0; i < 4; i++) {
//				if (sub2[i] == 0) {
//					sub2[i] = stNum;
//					break;
//				}
//			}
//			break;
//		case 3:
//			for (int i = 0; i < 4; i++) {
//				if (sub3[i] == 0) {
//					sub3[i] = stNum;
//					break;
//				}
//			}
//			break;
//		case 4:
//			for (int i = 0; i < 4; i++) {
//				if (sub4[i] == 0) {
//					sub4[i] = stNum;
//					break;
//				}
//			}
//			break;
//
//		default:
//			break;
//		}
		run();
	}

	private int passNum(int subNum) {

		int num = 0;

		// 2중배열로 짧아진 코드
		for (int i = 0; i < 4; i++) {
			if (subs[subNum][i] != 0) {
				num++;
			}
		}

//		switch (subNum) {
//		case 1:
//			for (int i = 0; i < 4; i++) {
//				if (sub1[i] != 0) {
//					num++;
//				}
//			}
//			break;
//		case 2:
//			for (int i = 0; i < 4; i++) {
//				if (sub2[i] != 0) {
//					num++;
//				}
//			}
//			break;
//		case 3:
//			for (int i = 0; i < 4; i++) {
//				if (sub3[i] != 0) {
//					num++;
//				}
//			}
//			break;
//		case 4:
//			for (int i = 0; i < 4; i++) {
//				if (sub4[i] != 0) {
//					num++;
//				}
//			}
//			break;
//
//		default:
//			break;
//		}
		return num;
	}

	private void status() { // 차량배열 안 번호로 역 이름 출력

		// 2중배열로 짧아진 코드
		System.out.println("=================================");
		for (int i = 0; i < 4; i++) {
			System.out.printf("%d호차:", i + 1);
			for (int j = 0; j < 4; j++) {
				System.out.printf(" %s", stationName(subs[i][j]));
			}
			System.out.println();
		}
		System.out.println("=================================");

//		System.out.println("=================================");
//		System.out.println("1호차: " + stationName(sub1[0]) + " " + stationName(sub1[1]) + " " + stationName(sub1[2])
//				+ " " + stationName(sub1[3]));
//		System.out.println("2호차: " + stationName(sub2[0]) + " " + stationName(sub2[1]) + " " + stationName(sub2[2])
//				+ " " + stationName(sub2[3]));
//		System.out.println("3호차: " + stationName(sub3[0]) + " " + stationName(sub3[1]) + " " + stationName(sub3[2])
//				+ " " + stationName(sub3[3]));
//		System.out.println("4호차: " + stationName(sub4[0]) + " " + stationName(sub4[1]) + " " + stationName(sub4[2])
//				+ " " + stationName(sub4[3]));
//		System.out.println("=================================");
		run();

	}

	private void move() {
		if (curStation != 5) {
			curStation++;
		} else {
			curStation = 1;
		}
		run();
	}

	private String stationName(int stNum) {
		String str = "";
		switch (stNum) {
		case 1:
			str = "합정";
			break;
		case 2:
			str = "홍대입구";
			break;
		case 3:
			str = "신촌";
			break;
		case 4:
			str = "이대";
			break;
		case 5:
			str = "아현";
			break;

		default:
			str = "";
			break;
		}
		return str;
	}
}
