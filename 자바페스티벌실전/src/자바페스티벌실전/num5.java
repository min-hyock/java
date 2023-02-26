package 자바페스티벌실전;

import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int input = sc.nextInt();

		for (int i = input; i > 0; i--) {
			System.out.print("*");
			for (int j = i; j < input; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}