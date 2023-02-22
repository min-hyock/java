package 반복문;

import java.util.Scanner;

public class 반복문_보충 {

	public static void main(String[] args) {

		// 반복문을 실행 시킬 수 있는 조건
		// true !

//		while(true) {
//			System.out.println("반복문 실행!");
//			break;
//		}
//		
//		// while문과 비슷하지만 다른 구조를 가진 문법
//		// do-while문
//		// 최초 실행은 검사조건 상관없이 무조건 실행할 수 있는 구조
//		
//		do {
//			System.out.println("반복문 실행");
//			
//		} while(true);

		// 반복의 패턴
		// 1. 숫자 입력:
		// 2. 짝수 ?
		// 3. 홀수 ?

		Scanner sc = new Scanner(System.in);

		int acnt = 0;
		int bcnt = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				acnt++;
			} else if (num % 2 == 1) {
				bcnt++;
			} else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("짝수개수 : " + acnt);
			System.out.println("홀수개수 : " + bcnt);
		}

	}

}
