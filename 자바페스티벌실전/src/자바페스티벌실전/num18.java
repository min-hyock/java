package 자바페스티벌실전;

import java.util.Iterator;
import java.util.Random;

public class num18 {

	public static void main(String[] args) {

		Random ran = new Random();		
		
		int[] luck = new int[6];
		
		
		
		for (int i = 0; i < 6; i++) {
			luck[i] = ran.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if(luck[i]==luck[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int j = 0; j < luck.length; j++) {
			System.out.println("행운의 숫자 : " + luck[j]);
			
		}
		
	}

}
