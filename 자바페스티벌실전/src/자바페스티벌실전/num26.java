package 자바페스티벌실전;

import java.util.Scanner;

public class num26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int fir = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int sec = sc.nextInt();
		
		int a = fir * (sec%10);
		int b = fir * (sec/10%10);
		int c = fir * (sec/100);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a+(b*10)+(c*100));
		
		
		
	}

}
