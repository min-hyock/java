package 자바페스티벌실전;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		int result = num % 10 >= 5 ? num / 10 * 10 + 10 : num / 10 * 10;

		System.out.print("반올림 수 : " + result);

	}

}