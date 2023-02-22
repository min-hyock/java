package 자바페스티벌;

import java.util.Iterator;

public class javafestival23번 {

	public static void main(String[] args) {
//		int[][] array = new int[5][5];
//
//		int num = 1;
//
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				array[i][j] = num++;
//			}
//		}
//		System.out.println("원본");
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print(" " + array[i][j]);
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//
//		int num1 = 1;
//
//		for (int j = 0; j < 5; j++) {
//			for (int i = 4; i >= 0; i--) {
//				array[j][i] = num1++;
//			}
//		}
//		System.out.println("90도 회전");
//		for (int j = 0; j < 5; j++) {
//			for (int i = 0; i < 5; i++) {
//				System.out.print(" " + array[i][j]);
//			}
//			System.out.println();
//		}
//		

		int[][] array = new int[5][5];

		int num = 1;
		System.out.println("원본");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}

		int num1 = 1;
		System.out.println("90도 회전");
		for (int i = 0; i < array.length; i++) {
			for (int j = 4; j >= 0; j--) {
				array[j][i] = num1++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}

	}

}
