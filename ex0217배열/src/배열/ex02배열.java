package 배열;

import java.util.Random;

public class ex02배열 {

	public static void main(String[] args) {

		// 1.정수형 데이터 5개를 보관할 수 있는 array 배열 생성
		int[] array = new int[3];
		// 2. 배열의 모든 인덱스 안에 있는 데이터를 랜덤한 값으로 변경(1~10)
		Random ran = new Random();

		// 배열의 크기를 가져오는 방법 ---> 배열이름.length
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			// 3. 배열 안에 있는 모든 값을 출력하기
			System.out.print(array[i] + " ");
		}
		
		
		
//		array[0] = ran.nextInt(10) + 1;
//		array[1] = ran.nextInt(10) + 1;
//		array[2] = ran.nextInt(10) + 1;
//		array[3] = ran.nextInt(10) + 1;
//		array[4] = ran.nextInt(10) + 1;
//		
//		System.out.print(array[0] + " ");
//		System.out.print(array[1] + " ");
//		System.out.print(array[2] + " ");
//		System.out.print(array[3] + " ");
//		System.out.print(array[4] + " ");
		
		
		
		
		
		
	}

}
