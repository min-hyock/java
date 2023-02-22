package 자바페스티벌;

import java.util.Scanner;

public class javafestival1번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int target = sc.nextInt();
		
		int week = 1;
		
		while(true) {
			System.out.print(week+"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			now -= minus;
			if(now<=target) {
				System.out.print(now+"kg 달성 !! 축하합니다!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
