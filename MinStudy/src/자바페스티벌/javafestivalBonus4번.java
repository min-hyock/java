package 자바페스티벌;

import java.util.Scanner;

public class javafestivalBonus4번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " : ");
			for (int k = 0; k < array[j]; k++) {
				System.out.print("*");
			}System.out.println();

		}
	}

}
