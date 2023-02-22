package 자바페스티벌;

import java.util.Arrays;
import java.util.Scanner;

public class javafestival30번 {

	public static void main(String[] args) {

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String input = sc.next();

//		String input = "smart Media";

		String low = input.toLowerCase();
		String[] data = low.split("");

		System.out.println(Arrays.toString(data));

		int cnt = 0;
		for (int i = 0; i < data.length; i++) {

		}
		for (int i = 97; i < 123; i++) {
			System.out.println((char) (i) + ": ");

		}

	}

}
