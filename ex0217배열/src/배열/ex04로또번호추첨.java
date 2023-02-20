package 배열;

import java.util.Arrays;
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
					i--; // 중복된 숫자가 발생했다면 다시 인덱스번호를 앞으로 보낼 수 있는 코드
					break; // 만약에 중복된 숫자가 하나라도 발견됐다면 멈추고 올린다.
				}
			}
		}
//		for (int k = 0; k < 5; k++) {
//			System.out.print(array[k]+" ");
//		}
//		Arrays.sort(array); // 오름차순
		System.out.println(Arrays.toString(array));

	}
}
