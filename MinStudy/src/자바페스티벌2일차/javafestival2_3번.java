package 자바페스티벌2일차;

import java.util.Random;
import java.util.Scanner;

public class javafestival2_3번 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int chance = 0;

		while (true) {
			int num1 = r.nextInt(10);
			int num2 = r.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int result = sc.nextInt();
			if ((num1 + num2) == result) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				chance++;
			}
			if (chance > 4) {
				System.out.println("GAME OVER!");
				break;
			}

		}

	}

}
