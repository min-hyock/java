package 산술연산자;

import java.util.Scanner;

public class ex03산술연산자예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("정수입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("결과 값 : " + num1 / 100 * 100);
//		
//		System.out.print("정수입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("결과 값 : " + num2 / 100 * 100);
//
//		1. 입력받는 도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		2. 정수입력 출력하기(개행없이)
//		System.out.print("정수 입력 : ");
//		3. 정수 입력받기
//		int num = sc.nextInt();
//		4. 백의 자리 이하를 버리기
//		백의 자리만 구하기
//		int result = num / 100 * 100;
//		백의 자리 이하의 숫자를 구하기
//		int result2 = num - num % 100;
//		
//		5. 결과값 출력하기
//		System.out.println("결과 값 : " + result);
//		System.out.println("결과 값 : " + result2);	

		// 산술연산자 예제

		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();

		int hour = totalSecond / 3600;
		int min = totalSecond % 3600 / 60;
		int sec = totalSecond % 3600 % 60;

		System.out.println(hour + "시" + min + "분" + sec + "초");

	}
}
