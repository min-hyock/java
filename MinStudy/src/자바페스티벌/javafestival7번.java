package 자바페스티벌;

import java.util.Iterator;
import java.util.Scanner;

public class javafestival7번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
