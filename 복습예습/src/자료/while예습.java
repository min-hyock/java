package 자료;

import java.util.Scanner;

public class while예습 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int sum = 0;
	float avg = 0;
	
	while(true) {
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		
		if(a < 100) {
			sum = sum + a;
			avg++;
		}else {
			break;
		}
	}
		System.out.println("합계 : " + sum );
		System.out.print("평균 : " + sum / avg );
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
