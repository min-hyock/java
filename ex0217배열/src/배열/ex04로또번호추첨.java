package 배열;

import java.util.Random;

public class ex04로또번호추첨 {
	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[5];
		System.out.println("====로또타임====");

		System.out.println("이번주 출력번호는요...!! 두구두구두구!!!!");

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					array[i] = ran.nextInt(10) + 1;
					i--;
				}
			}
		}
		for (int k = 0; k < 5; k++) {
			System.out.print(array[k]+" ");
		}

//	array[0] = ran.nextInt(10)+1; 

//		array[1] = ran.nextInt(10) + 1;
//		if (array[1] == array[0]) {
//			array[1] = ran.nextInt(10) + 1;
//		}
//		System.out.println(array[1]);
//
//		array[2] = ran.nextInt(10) + 1;
//		if (array[2] == array[0]) {
//			array[2] = ran.nextInt(10) + 1;
//		}
//		System.out.println(array[2]);
//
//		array[3] = ran.nextInt(10) + 1;
//		if (array[3] == array[0]) {
//			array[3] = ran.nextInt(10) + 1;
//		}
//		System.out.println(array[3]);
//
//		array[4] = ran.nextInt(10) + 1;
//		if (array[4] == array[0]) {
//			array[4] = ran.nextInt(10) + 1;
//		}
//		System.out.println(array[4]);

	}
}
