package 자바페스티벌;

import java.util.Scanner;

public class javafestivalBonus2번 {

	public static void main(String[] args) {

//		System.out.println(getMiddle("power"));
//		System.out.println(getMiddle("test"));
//	}
//
//	private static String getMiddle(String text) {
//
//		int length = text.length();
//		int div = length / 2;
//		String result = null;
//
//		if (length % 2 == 0) {
//			result = text.substring(div - 1, div + 1);
//		} else if (length % 2 == 1) {
//			result = text.substring(div, div + 1);
//
//		}
//		return result;

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String word) {

		String result = null;

		int length = word.length();

		if (length % 2 == 0) {
			result = word.substring(length / 2 - 1, length / 2 + 1);
		} else {
			result = word.substring(length / 2, length / 2 + 1);
		}

//		String result = length%2==0?word.substring(length/2-1,length/2+1):word.substring(length/2,length/2+1);

		return result;
	}

}