package 자바페스티벌5일차;

import java.util.Scanner;

public class javafestival2번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.print("3의 배수는 : ");
		for (int j = 0; j < array.length; j++) {
			if (array[j] % 3 == 0) {
				System.out.print(array[j]+" ");
			}
		}

	}

}
