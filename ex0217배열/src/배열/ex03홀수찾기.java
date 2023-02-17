package 배열;

import java.util.Random;
import java.util.Scanner;

public class ex03홀수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[5];

		int num = 0;

		System.out.print("array에 들어있는 홀수는 ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				num++;
			}
		}
		System.out.println("이며,");
		System.out.println("총" + num + "개 입니다");
		
		
		

		// 응용 >> 인덱스 크기 입력받아서 출력하기
		
//		Random ran = new Random();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("인덱스의 크기는 : ");
//		int arr = sc.nextInt();
//		int[] array = new int[arr];
//
//		System.out.print("array에 들어있는 홀수는 ");
//
//		int num = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			array[i] = ran.nextInt(100) + 1;
//			if (array[i] % 2 == 1) {
//				System.out.print(array[i] + " ");
//				num++;
//			}
//		}
//		System.out.println("이며,");
//		System.out.println("총" + num + "개 입니다");
		
		
	}

}
