package 자바페스티벌;

import java.util.Scanner;

public class javafestival26번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 숫자 입력 >> ");
		int first = sc.nextInt();
		System.out.print("두 번쨰 숫자 입력 >> ");
		int sec = sc.nextInt();
		
		int a = first * (sec%10);
		int b = first * (sec%100/10);
		int c = first * (sec/100);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int sum = a + b*10 + c*100;
		
		System.out.println(sum);
	}

}
