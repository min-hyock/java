package 반복문;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {

//		// 만약 age가20보다 크거나 같다면 "성인입니다"라고 출력하는 프로그램을 만들어보세요
//		
//		// 1. 입력도구 꺼내오기
//		Scanner sc =new Scanner(System.in);
//		
//		// 2. 키보드로 값을 받을 출력문 작성 (개행 제거)
//		System.out.print("나이를 입력하세요 : ");
//		
//		// 3. age라는 변수명 만들기, 정수형으로 입력도구 받아오기
//		int age = sc.nextInt();
//		
//		// 4. 조건문을 사용해 20보다 크거나 같다면 "성인입니다." 출력
//		if( age >= 20) {
//			System.out.println("성인입니다.");
//		}

		// num이 3의 배수이면서 5의 배수라면 "3과 5의 배수입니다" 라고 출력하는 프로그램 만들기

		// 1. 입력도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num % 3 == 0 && num % 5 == 0) {
//			System.out.println("3과 5의 배수입니다.");
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요 : ");
//		int grade = sc.nextInt();
//		
//		if(grade >= 60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
//		
//		System.out.println("==에버랜드에 오신 걸 환영합니다==");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		System.out.print("인원수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		int price = 5000;
//		
//		if(age < 20) {
//			System.out.println("총" + (int)(num * price * 0.5)+ "원입니다.");
//		}else {
//			System.out.println("총" + num * price + "원입니다.");
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int pur = sc.nextInt();

		int wek = 1;

//		while(now > pur) {
//			System.out.print(wek + "주차 감량 몸무게 :");
//			int cut = sc.nextInt();
//			now = now - cut;
//			wek++;
//		}
		while (true) {
			System.out.print(wek + "주차 감량 몸무게 :");
			int cut = sc.nextInt();
			now = now - cut;
			wek++;
			if (now <= pur) {
				break;
			}

		}

		System.out.println(now + "kg달성 ! 축하합니다!");

		
		
		
		
		
		
	}

}
