package for문;

import java.util.Random;
import java.util.Scanner;

public class ex05약수구하기 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1;i<=num;i++) {
//			if(num % i == 0) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		
		Random ran = new Random();
		   
		   while(true) {
		   int rannum = ran.nextInt(9);
		   int rannum2 = ran.nextInt(9);
		   int sum = (rannum + rannum2);
		      
		   System.out.print(rannum+" + "+rannum2+" = ");

		   
		   Scanner sc = new Scanner(System.in);
		   int num = sc.nextInt();
		      
		   int i = 0;
		   
		      if(num==sum) {
		         System.out.println("SUCCESS!");
		      } else {
		         System.out.println("Fail...");
		         i++;
		      } 
		      
		      if(i>4) {
		         break;
		      }
		   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
