package 자바페스티벌;

import java.util.Scanner;

public class javafestival27번 {

	public static void main(String[] args) {

//		System.out.println("==== 채점하기 ====");
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		String answer = sc.next();
//
//		String[] test = answer.split("");
//
//		int sum = 0;
//		int cnt = 1;
//
//		for (int i = 0; i < test.length; i++) {
//			if (test[i].equals("o")) {
//				sum += cnt;
//				cnt++;
//			} else {
//				cnt = 1;
//			}
//		}
//		System.out.println(sum);

		System.out.println("==== 채점하기 ====");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		String[] data = input.split("");

		int sum = 0;
		int cnt = 1;
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("o")) {
				sum += cnt;
				cnt++;
			} else {
				cnt = 1;
			}
		}
		System.out.println(sum);

	}

}
