package 배열;

import java.util.Scanner;

public class 배열_점수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}

		System.out.print("입력된 점수 : " + "[ ");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println("]");

		int max = array[0];
		int min = array[0];

		for (int j = 0; j < array.length; j++) {
			if (max < array[j]) {
				max = array[j];
			} else if (min > array[j]) {
				min = array[j];
			}
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);

		int sum = 0;
		for (int h = 0; h < array.length; h++) {
			sum += array[h];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (float) sum / array.length);

	}

}
