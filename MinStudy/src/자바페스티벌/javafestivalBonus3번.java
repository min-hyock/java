package 자바페스티벌;

import java.util.Scanner;

public class javafestivalBonus3번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1, num2, op));
	}
	public static int cal(int num1, int num2, char op) {

		int result = 0;

		if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}else {
			result = 0;
		}
		return result;
	}

}