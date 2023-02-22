package 자바페스티벌;

import java.util.Scanner;

public class javafestival20번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int input = sc.nextInt();
		
		String result = Integer.toBinaryString(input);
		
		System.out.println(result+" ");

	}

}