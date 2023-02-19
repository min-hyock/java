package 배열;

import java.lang.reflect.Array;
import java.util.Scanner;

public class 배열_수박게임 {

	public static void main(String[] args) {

		System.out.println("====수박 게임 start ~!====");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int input = sc.nextInt();

		char[] data = { '수', '박' };

		for (int i = 0; i < input; i++) {
			if (i % 2 == 0) {
				System.out.print(data[0]);
			} else {
				System.out.print(data[1]);
			}
		}

	}

}
