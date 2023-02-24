package 자바페스티벌;

import java.util.Scanner;

public class javafestival12번 {

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
			for (int j = 0; j < array.length; j++) {
				array[j][i] = input++;
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
