package 메소드;

import java.util.Scanner;

public class ex04가까운수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
	}

	private static int close10(int num1, int num2) {
//		int result = 0;
//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		if (a < 0) {
//			a *= (-1);
//		} else if (b < 0) {
//			b *= (-1);
//		}
//
//		if (a > b) {
//			result = num2;
//		} else if (a == b) {
//			result = 0;
//		} else if (a < b) {
//			result = num1;
//		}
//		return result;
		// 절대값
		int result = 0;
		if(Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
			result =num1;
		}else if(Math.abs(num1 - 10) > Math.abs(num2 - 10)) {
			result = num2;
		}else {
			result = 0;
		}
		return result;
	}

}
