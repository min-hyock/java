package 삼항연산자;

import java.util.Scanner;

public class ex02홀짝구하기 {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		
//		int num1 = sc.nextInt();
//		
//		String result = num1 % 2 == 0 ? num1+"는(은)짝수입니다.":num1+"는(은)홀수입니다.";
//		System.out.println(result);
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수를 입력하세요. 출력하기(개행없이)
		System.out.print("정수를 입력하세요. : ");
		// 3. 정수 입력받기
		int num = sc.nextInt();
		// 4. 입력받은 정수가 홀수인지 짝수인지 판별하기
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "는(은)"+ result + "입니다");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
