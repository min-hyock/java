package 자바페스티벌실전;

import java.util.Scanner;

public class num14번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] arr = new int[N][N];

		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = num++;
				}
			}

			else {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[i][j] = num++;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
