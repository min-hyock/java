package 삼항연산자;

import java.util.Scanner;

public class ex03농구공개수구하기 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("농구공의 개수를 입력하세요 : ");
//		int num = sc.nextInt();
//
//		int result = num % 5 == 0 ? (num / 5) : (num / 5) + 1;
//
//		System.out.println("필요한 상자의 수 : " + result);
		
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 농구공의 개수를 입력하세요. 출력하기(개행없이)
		System.out.print("농구공의 개수를 입력하세요 : ");
		// 3. 농구공 개수 데이터 입력받기
		int ball = sc.nextInt();
		// 4. 필요한 상자의 수 구하기 (삼항 연산자 사용)
		int result = ball % 5 > 0 ? ball / 5  + 1 : ball / 5;
		// 5. 결과 출력하기
		System.out.println("필요한 상자의 개수 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
