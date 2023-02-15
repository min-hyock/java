package 자바페스티벌;

import java.util.Scanner;

public class javafestival3_3번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(" n 입력 : ");
		int n = sc.nextInt();

		int sum = 0;
		int plus = 0;

		for (int i = 0; i < n; i++) {
			sum += 1 + plus;
			System.out.print(sum + " ");
			if (i > 0)
				plus++;

		}

	}

}
