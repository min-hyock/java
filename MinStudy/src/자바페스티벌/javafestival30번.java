package 자바페스티벌;

import java.util.Scanner;

public class javafestival30번 {

	public static void main(String[] args) {

		// 알파벳의 갯수만큼 배열의 공간 만들기
		int[] cnt = new int[26];
		// cnt[0] -> a의 갯수를 담을 수 있는 공간
		// cnt[1] -> b의 갯수를 담을 수 있는 공간

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String input = sc.nextLine(); // nextLine() : 공백을 포함한 한 문장을 인지할 수 있는 메소드

		for (int i = 0; i < input.length(); i++) {
			// String -> char == 65
			char ch = input.charAt(i); // "a" -> 'a'
			// ch가 대문자인지 소문자인지 판단
			if (ch >= 'A' && ch <= 'Z') {
				cnt[ch - 'A']++;
			} else if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a']++;
			}

		}

		for (int i = 0; i < cnt.length; i++) {
			System.out.println((char) (i + 97) + ":" + cnt[i]);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}