package 자바페스티벌5일차;

import java.util.Iterator;

public class javafestival5번 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int minus = 0;
		int min = 0;
		int fir = 0;
		int sec = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (point[i] - point[j] > 0) {
					minus = point[i] - point[j];
					if (minus == 7) {
						fir = i;
						sec = j;
					}
				}
			}
		}
		System.out.print("result = " + "[" + fir + "," + sec + "]");

		
		
		
		
	}

}