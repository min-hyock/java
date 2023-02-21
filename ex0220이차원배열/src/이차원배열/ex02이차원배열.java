package 이차원배열;

import java.util.Scanner;

public class ex02이차원배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("열 입력 : ");
		int num2 = sc.nextInt();
		int[][] array = new int[num1][num2];
		System.out.print("시작 번호 : ");
		int num3 = sc.nextInt();

		int num = num3;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = num++;
			}
		}

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
