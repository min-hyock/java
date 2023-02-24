package 자바페스티벌;

import java.util.Scanner;

public class javafestival2번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();

		int max = 8;

		int result = work> max ? max * 5000 + (work - max) * (int) (5000 * 1.5) : work * 5000;
		System.out.println("총 임금은" + result + "원 입니다.");

	}

}
