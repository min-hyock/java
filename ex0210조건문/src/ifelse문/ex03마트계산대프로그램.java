package ifelse문;

import java.util.Scanner;

public class ex03마트계산대프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int pay = 5000 ;
		
		if(time > 8) {
			System.out.println("총 임금은 " + (time * pay + (int)((time-8) * pay * 0.5)) + "원 입니다.");
		}else {
			System.out.println("총 임금은 " + (time * pay) + "원 입니다.");
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
