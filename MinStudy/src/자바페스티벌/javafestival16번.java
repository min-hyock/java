package 자바페스티벌;

import java.util.Scanner;

public class javafestival16번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		int sum = 0;

		for (int i = 0; i < 8; i++) {
			sum += input % 10;
			input /= 10;
		}
		System.out.print("합은" + sum + "입니다.");

	}

}