package ifelse문;

import java.util.Scanner;

public class ex02입장료계산프로그램 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("인원수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		int price = 5000 ; 
//		
//		if(age < 20 ) {
//			System.out.println("총" + (int)(price * 0.5) * num + "원 입니다.");
//		}else {
//			System.out.println("총" + (price * num) + "원 입니다.");
//		}
		

		
		// 1. 입력도구 꺼내오기
		Scanner sc= new Scanner(System.in);
		// 2. 나이 입력받기
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		// 3. 인원수 입력받기
		System.out.print("인원 수 입력 : ");
		int inwon = sc.nextInt();
		// 4. 입장료 계산하기
		// ★★★★★지역변수(local variable)★★★★★
		// : {} 영역 안에서 선언된 변수는 {} 영역안에서만 사용 가능하다 !
		// >>> {} : scope
		int money = 0;
		if(age < 20) {
			// 4-1. 나이가 20세 미만이라면 입장료 50% 할인(기본 입장료 : 5000)
			 money = (int) (5000 * inwon * 0.5);
		}else {
			// 4-2. 그렇지 않은 결우 입장료 그대로 꼐산 (기본 입장료 : 5000)
			 money = 5000 * inwon;
		}
		
		// 5. 결과 출력하기
		System.out.println("입장료는" + money + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
