package 자바페스티벌5일차;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class javafestival7번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		System.out.println("정렬 후");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));

	}
}
