package 자바페스티벌;

import java.util.Scanner;

public class javafestival8번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result = num%10>=5?(num/10)*10+10:(num/10)*10;
		System.out.println("반올림 수 : "  + result);

	}

}
