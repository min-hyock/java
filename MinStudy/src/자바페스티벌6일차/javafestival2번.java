package 자바페스티벌6일차;

import java.util.Scanner;

public class javafestival2번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int num = sc.nextInt();
		System.out.print("열 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 N : ");
		int input = sc.nextInt();

		int[][] array = new int[num][num1];

		int N = input;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array.length; j++) {
					array[i][j] = input++;
				}
			} else if (i % 2 == 1) {
				for (int k = num1 - 1; k >= 0; k--) {
					array[i][k] = input++;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
