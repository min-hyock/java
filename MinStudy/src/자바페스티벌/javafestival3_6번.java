package 자바페스티벌;

import java.util.Scanner;

public class javafestival3_6번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();

		int fac = 1;

		for (int i = 1; i <= input; i++) {
			fac *= i;
		}

		System.out.print("출력 : " + fac);

	}

}
