package 자바페스티벌1일차;

import java.util.Scanner;

public class javafestival3번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
//		
//		// 1. 1의 자리에서 반올림
//		if(num%10 >= 5) {
//			System.out.println("반올림 수 : " + (num/10)*10+10 );
//		}else {
//			System.out.println("반올림 수 : " + (num/10)*10 );
//		}
		
		int result = num%10>=5?(num/10)*10+10:(num/10)*10;
		System.out.println("반올림 수 : "  + result);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
