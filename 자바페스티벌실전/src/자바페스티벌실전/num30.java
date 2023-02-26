package 자바페스티벌실전;

import java.util.Arrays;
import java.util.Scanner;

public class num30 {

	public static void main(String[] args) {

		int[] cnt = new int[26];

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>");
		String input = sc.nextLine();

		String[] str = input.split("");

		for (int i = 0; i < str.length; i++) {

			char a = input.charAt(i);
//					 65          90
			if (a >= 'A' && a <= 'Z') {
				cnt[a - 'A']++;
			} else if (a >= 'a' && a <= 'z') {
				cnt[a - 'a']++;
			}
		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println((char) (i + 97) + " : " + cnt[i]);
		}

	}

}
