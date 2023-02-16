package 자바페스티벌1일차;

import java.util.Scanner;

public class javafestival1번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.print("일한 시간을 입력하세요 : ");
//		int time = sc.nextInt();
//		
//		int money = 5000;
//		int work = time - 8;
//		
//		
//		if(time > 8) {
//			System.out.println("총 임금은" + ((time - work) *  money + (int)(work * money * 1.5)) + "원 입니다.");
//		}else {
//			System.out.println("총 임금은" + time * money + "원 입니다.");
//			
//		}
		
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int max = 8;
		
		int result = time>max?max*5000+(time-max)*(int)(5000*1.5):time*5000;
		System.out.println("총 임금은" + result + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
