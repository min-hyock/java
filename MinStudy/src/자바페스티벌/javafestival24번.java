package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class javafestival24번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}

		System.out.print("결과 >> ");
		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
