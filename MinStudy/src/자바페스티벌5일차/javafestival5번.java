package 자바페스티벌5일차;

import java.util.Iterator;

public class javafestival5번 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		
		int sum = 0;
		int num = 0;
		for (int j = 0; j < point.length-1; j++) {
			for (int i = j+1; i < point.length; i++) {
				if(point[j] > point[i]) {
					sum = point[j] - point[i];
				}else if(point[j] < point[i]){
					num = point[i] - point[j];
				}
				
			}
		}
		
//		num = point[3] - point[5] ;
		
		System.out.println(sum);
	}

}