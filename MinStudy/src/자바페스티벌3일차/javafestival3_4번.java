package 자바페스티벌3일차;

import java.util.Scanner;

public class javafestival3_4번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" n 입력 : ");
		int n = sc.nextInt();

		int plus = 1;

		for (int i = 0; i < n; i++) {
			plus += i;
			System.out.print(plus + " ");

		}

	}

}
