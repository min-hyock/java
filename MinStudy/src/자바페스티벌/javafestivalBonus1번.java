package 자바페스티벌;

import java.util.Scanner;

public class javafestivalBonus1번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(" A 입력 >> ");
			int a = sc.nextInt();
			System.out.print(" B 입력 >> ");
			int b = sc.nextInt();
			int minus = a - b;
			if (a == 0 && b == 0) {
				break;
			}
			System.out.println("결과 >> " + minus);
		}

	}

}
