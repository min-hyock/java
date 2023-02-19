package 배열;

import java.util.Random;

public class 배열_가장큰수찾기 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Random ran = new Random();

		int max = array[0];

		System.out.print("배열 안에 들어있는 값 : " + "[" + " ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			System.out.print(array[i] + " ");
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("]");
		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
