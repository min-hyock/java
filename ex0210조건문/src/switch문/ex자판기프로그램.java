package switch문;

import java.util.Scanner;

public class ex자판기프로그램 {

	public static void main(String[] args) {

//		// if-else 문
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("금액을 입력하세요 >>");
//		int cash = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요.");
//		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
//		int snack = sc.nextInt();
//		
//		int snack1 = cash - 700;
//		int snack2 = cash - 1000;
//		int snack3 = cash - 500;
//		
//		if(snack == 1) {
//			System.out.println("잔돈 :" + snack1 + "원");
//		}else if(snack == 2) {
//			System.out.println("잔돈 :" + snack2 + "원");		
//		}	
//		else if(snack == 3)  {
//			System.out.println("잔돈 :" + snack3 + "원");
//			
//		}else {
//			System.out.println("잘못 선택하셨습니다.");
//		}
//		
//		
//		// switch문
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("금액을 입력하세요 >>");
//		int cash = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요.");
//		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
//		int snack = sc.nextInt();
//		
//		switch(snack) {
//		case 1:
//			System.out.println("잔돈 : " + (cash - 700) + "원");
//			break;
//		case 2:	
//			System.out.println("잔돈 : " + (cash -1000) + "원");	
//			break;
//		case 3:	
//			System.out.println("잔돈 : " + (cash -500) + "원");	
//			break;
//		default:
//				System.out.println("잘못 선택하셨습니다");
//			break;
//		}

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 출력문 작성하기
		System.out.println("금액을 입력하세요 >> ");
		// 3. 입력금액 저장할 변수 선언하기
		int money = sc.nextInt();
		// 4. 출력문 작성하기
		System.out.println("메뉴를 고르세요.");
		// 5. 출력문 작성하기 (메뉴판)
		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
		// 1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원)
		// 6. 사용자가 선택한 메뉴 입력받기 (변수 선언하기)
		int menu = sc.nextInt();
		int change = money;
		String ex = "돈이 부족해요";
		
		// 7. 사용자가 선택한 메뉴가 무엇인지 판단

		if (menu == 1) {
			// 700 이구동성
			// 입력한 금액이 선택한 메뉴의 금액보다 더 큰지 판단
			if (money >= 700) {
				change = money - 700;
			} else {
				System.out.println(ex);
			}
		} else if (menu == 2) {
			if (money >= 1000) {
				change = money - 1000;
			} else {
				System.out.println(ex);
			}
		} else if (menu == 3) {
			if (money >= 500) {
				change = money - 500;
			} else {
				System.out.println(ex);
			}
		}
		System.out.println("잔돈 : " + change + "원");
		
		int a = change/1000;
		int b = change%1000/500;
		int c = change%1000%500/100;
		
		System.out.println("천원 : " + a +"개"+ ", 오백원 : " + b +"개" + ", 백원 : " + c + "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
