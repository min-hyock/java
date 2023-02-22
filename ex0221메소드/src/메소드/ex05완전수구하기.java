package 메소드;

import java.util.Scanner;

public class ex05완전수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisior = isDivisior(num1, num2);
		System.out.println(divisior);
		System.out.println();
		System.out.println(getSum(7));
		System.out.println(getSum(44));
		System.out.println();
		System.out.println(isperfect(7));
	}
	// 완전수를 구하는 메소드
	private static boolean isperfect(int num) {

		boolean result = false;

		for (int i = 1; i <= num; i++) {
			if (num == getSum(num)) {
				result = true;
			}
		}

		return result;
	}

	// 자신을 제외한 약수의 총합을 구하는 메소드
	private static int getSum(int num) {
		int result = 0;

		for (int i = 1; i < num; i++) {
//			if (num % i == 0) {
//				result += i;
//			}
			// 메소드를 호출한 로직
			// 메소드 구조 안에서 새롭게 메소드를 구현할 수는 없으나
			// 메소드 자체를 호출해서 사용하는 것은 가능하다.
			if (isDivisior(num, i) == true) {
				result += i;
			}
		}

		return result;
	}

	private static boolean isDivisior(int num1, int num2) {

		boolean result = num1 % num2 == 0 ? true : false;

		return result;
	}

}
