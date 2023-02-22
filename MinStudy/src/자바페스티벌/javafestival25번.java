package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class javafestival25번 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
//		String input = sc.next();
//
//		// 0 1 2 3 4 5 6 7 8 9
//		// 6 2 5 5 4 5 6 3 7 6
//
//		String[] data = input.split("");
//
//		int sum = 0;
//		for (int i = 0; i < data.length; i++) {
//			switch (data[i]) {
//			case "0", "6", "9":
//				sum += 6;
//				break;
//			case "1":
//				sum += 2;
//				break;
//			case "2", "3", "5":
//				sum += 5;
//				break;
//			case "4":
//				sum += 4;
//				break;
//			case "8":
//				sum += 7;
//				break;
//			case "7":
//				sum += 3;
//				break;
//			}
//		}
//		System.out.println("대시('-')의 총 합 >> " + sum);
		
		
		// 0 1 2 3 4 5 6 7 8 9
		// 6 2 5 5 4 5 6 3 7 6 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String input = sc.next();
		
		String[] data = input.split("");
		int cnt = 0;
		for (int i = 0; i < data.length; i++) {
			switch(data[i]) {
			case "0","6","9":
				cnt += 6; 
				break;
			case "1":
				cnt += 2; 
				break;
			case "2","3","5":
				cnt += 5; 
				break;
			case "4":
				cnt += 4; 
				break;
			case "7":
				cnt += 3; 
				break;
			case "8":
				cnt += 7; 
				break;
			}
		}System.out.print("대시('-')의 총 합 >> " + cnt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
