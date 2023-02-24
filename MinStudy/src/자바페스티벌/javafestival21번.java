package 자바페스티벌;

import java.util.Random;

public class javafestival21번 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] point = { 92, 32, 52, 9, 91, 2, 68 };

		int min = 0;
		int distance = 0;
		int index = 0;

		int num1 = ran.nextInt(7);
		int num2 = ran.nextInt(7);
		
		if(num1 != num2) {
			System.out.println(num1);
			System.out.println(num2);
		}

		if (num1 > num2) {
			min = point[num2];
			distance = num1 - num2;
			for (int i = num2; i < num1; i++) {
				if (min > point[i]) {
					min = point[i];
				}
			}
		}
		if (num1 < num2) {
			min = point[num1];
			distance = num2 - num1;
			for (int i = num1; i < num2; i++) {
				if (min > point[i]) {
					min = point[i];
				}
			}
		}
		for (int i = 0; i < point.length; i++) {
			if (min == point[i]) {
				index = i;
			}
		}

		System.out.println("result = " + distance +" , "+ index);
	}

}
