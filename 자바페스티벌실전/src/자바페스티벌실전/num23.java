package 자바페스티벌실전;

import java.util.Iterator;

public class num23 {

	public static void main(String[] args) {

		System.out.println("원본");
		
		int[][]arr = new int[5][5];		
		
		
		int num = 1;;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("90도 회전");
		
		int num1 = 1;;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = num1++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
