package com.elevator.service;

import java.util.Scanner;

public class ElevatorService {
	int curFloor; // 현재 층
	int[] passenger; // 층과 승객 수
	boolean direction; // 엘리베이터 방향

	public ElevatorService() {
		curFloor = 1;
		passenger = new int[3];
		direction = true;
	}

	public void run() {

		printCurFloor(); // 층 표시
		if (passenger[curFloor - 1] != 0) { // 해당 층 하차 인원 있으면 하차 출력
			System.out.printf("%d명이 하차하였습니다.\n", passenger[curFloor - 1]);
			passenger[curFloor - 1] = 0;
		}

		System.out.println("메뉴를 선택하세요.");
		System.out.println("1.탑승  2.이동  3.탑승현황  4.종료");

		Scanner scan = new Scanner(System.in);

		switch (scan.nextInt()) {
		case 1:
			join();
			break;
		case 2:
			move();
			break;
		case 3:
			state();
			break;
		case 4:
			System.out.println("엘리베이터를 종료합니다.");
			break;
		default:
			System.out.println("1~4를 선택 하세요.");
			run();

		}

	}

	private void printCurFloor() { // 현재 층 출력
		System.out.printf("엘리베이터 상태[현재 층 :[%d층]\n", curFloor);
	}

	private void join() {

		if (passNum() == 4) { // 탑승 시 4명이면 다시 메인으로 감
			System.out.printf("%c탑승할 공간이 없습니다!!!!%c\n", '※', '※');
			run();
		}

		while (true) { // 예외 처리 + 해당 층 제외 목적지 층 출력
			System.out.printf("몇층으로 가시겠습니까?[현재 층 : %d층]\n", curFloor);
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
				if (i + 1 != curFloor) {
					System.out.printf("%d.(%d층) ", i + 1, i + 1);
				}
			}
			System.out.println(">");

			try {
				int destFloor = scan.nextInt();
				if (destFloor != curFloor && destFloor > 0 && destFloor < 4) {
					passIn(destFloor);
					break;
				} else {
					System.out.println("현재 층입니다. 다시 입력해주세요.");

				}
			} catch (Exception e) {
				System.out.println("다시 입력해주세요.");
				continue;
			}

		}
		run();

	}

	private void passIn(int destination) { // 승객 입력
		System.out.printf("입력하신 층은 %d층입니다.\n", destination);
		passenger[destination - 1] += 1;

	}

	private int passNum() { // 승객 수
		int passNum = 0;
		for (int i = 0; i < 3; i++) {
			passNum += passenger[i];
		}
		return passNum;
	}

	private void move() {
		if (curFloor == 1) {
			direction = true;
		} else if (curFloor == 3) {
			direction = false;
		}

		if (direction == true) {
			curFloor++;
			System.out.println("올라갑니다~");
		} else if (direction == false) {
			curFloor--;
			System.out.println("내려갑니다~");
		}

		run();
	}

	private void state() {
		System.out.println("---- 탑승 현황 ----");
		printCurFloor();
		System.out.printf("현재 탑승 인원은 %d명 입니다.\n", passNum());
		run();
	}

}
