package 자바페스티벌5일차;

import java.util.Iterator;

public class javafestival5번 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				int min = point[i] - point[j];
				System.out.print(min + " ");
			}
		}

	}

}
