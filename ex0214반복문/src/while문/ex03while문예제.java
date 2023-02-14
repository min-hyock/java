package while문;

import java.util.Scanner;

public class ex03while문예제 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int input = sc.nextInt();
//			System.out.println("누적 결과 : " + (input + sum));
//			sum = input + sum;
//			if(input == -1) {
//				System.out.println("종료되었습니다");
//				break;
//			}
//		}

		// 1.입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력 출력하기 (줄바꿈 없이)
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			// 3. 정수 입력 받기
			int input = sc.nextInt();
			// 4. 입력받은 정수를 누적하기
			// --> 누적 받을 변수가 하나 필요
			// sum = sum + input;
			sum += input;
			System.out.println("누적 결과 : " + sum);
			// -1을 입력하면 종료되었습니다. 출력 후 프로그램 끝
			if(input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		// 5. 2~4까지 반복 !

		
		
		
		
		
		
		
		
	}

}
