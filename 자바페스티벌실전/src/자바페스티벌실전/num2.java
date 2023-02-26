package 자바페스티벌실전;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int max = 8;
		
		int result = time>max?(max*5000)+(int)(5000*1.5)*(time-max):5000*time;
		
		System.out.println(" 총 임금은 " + result + "원 입니다.");
		
		
		
		
	}

}
