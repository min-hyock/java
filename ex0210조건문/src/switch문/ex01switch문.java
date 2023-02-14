package switch문;

import java.util.Scanner;

public class ex01switch문 {

	public static void main(String[] args) {

		//학점 계산기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수 입력 : ");
//		int totalScore = sc.nextInt();
//		
//		switch(totalScore/10) {
//		case 9 : case 10:
//			System.out.println("A학점입니다 !");
//			break;
//		case 8:
//			System.out.println("B학점입니다 !");
//			break;
//		case 7:
//			System.out.println("C학점입니다 !");
//			break;
//		default :
//			System.out.println("D학점입니다 !");
//		}
		
		
		
		
//		// 1.입력받는 도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		// 2. 점수입력 : 출력
//		System.out.print("점수 입력 : ");
//		// 3. 숫자 입력 받기
//		int totalScore = sc.nextInt();
//		// 4. 학점계산하기 --> switch문으로
//		// 조건 - 90점 이상 : A
//		// 80점 이상 90점 미만 : B
//		// 70점 이상 80점 미만 : C
//		// 70점 미만 : D
//		char grade = 'A';
//		switch(totalScore/10) {
//		case 10:
//		case 9:	
//			grade='A';
//			break;
//		case 8:
//			grade='B';
//			break;
//		case 7:
//			grade='C';
//			break;
//		default:
//			grade='D';
//			break;
//		}
//		System.out.println(grade + "학점입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 >>");
		int cash = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
		int snack = sc.nextInt();
		
		switch(snack) {
		case 1:
			System.out.println("잔돈 : " + (cash - 700) + "원");
			break;
		case 2:	
			System.out.println("잔돈 : " + (cash -1000) + "원");	
			break;
		case 3:	
			System.out.println("잔돈 : " + (cash -500) + "원");	
			break;
		default:
				System.out.println("잘못 선택하셨습니다");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
