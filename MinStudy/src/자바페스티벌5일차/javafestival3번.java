package 자바페스티벌5일차;

import java.util.Random;

public class javafestival3번 {

	public static void main(String[] args) {

		int[] array = new int[6];
		Random ran = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
					break;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println("행운의 숫자 : " + array[k]);
		}

	}

}
