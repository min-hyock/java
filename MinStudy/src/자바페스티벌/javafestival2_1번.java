package 자바페스티벌;

import java.util.Scanner;

public class javafestival2_1번 {
	public static void main(String[] args) {

		// 다이어트 프로그램

//		Scanner sc = new Scanner(System.in);
//		System.out.print("현재몸무게 : ");
//		int now = sc.nextInt();
//		System.out.print("목표몸무게 : ");
//		int target = sc.nextInt();
//		
//		int wek = 1;
//		
//		while(true) {
//			System.out.print(wek + "주차 감량 몸무게 : ");
//			int minus = sc.nextInt();
//			wek++;
//			now =- minus;
//			if(now <= target) {
//				System.out.println(now + "kg 달성 !! 축하합니다 !");
//				break;
//			}
//		}

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력 받기
		System.out.print("현재 몸무게 입력 : ");
		int weight = sc.nextInt();
		// 3. 목표 몸무게 입력 받기
		System.out.print("목표 몸무게 입력 : ");
		int goal = sc.nextInt();
		int week = 1;
		// 4. 주차별 감량 몸무게 입력
		while (true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			// 5. 현재 몸무게 = 원래 몸무게 - 감량 몸무게
			weight = weight - minus;
			// 5-2. 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
			if (weight <= goal) {
				System.out.println(weight + "kg 달성 !! 축하합니다!");
				break;
			}
		}

		
		
		
		
		
		
		
		
		
		
	}
}
