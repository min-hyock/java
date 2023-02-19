package 자바페스티벌5일차;

import java.util.Random;

public class javafestival1번 {

	public static void main(String[] args) {

		int[] array = new int[8];

		Random ran = new Random();

		int num = ran.nextInt(100) + 1;

		System.out.print("배열에 있는 모든값 : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					array[i] = ran.nextInt(100) + 1;
					i--;
				}
			}
		}

		int max = array[0];
		int min = array[0];

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
			if (max < array[k]) {
				max = array[k];
			} else if (min > array[k]) {
				min = array[k];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
