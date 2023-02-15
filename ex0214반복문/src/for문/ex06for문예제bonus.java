package for문;

public class ex06for문예제bonus {
	public static void main(String[] args) {

//		int num = 0;
//		int num1 = 78;
//		
//		for (int i = 1; i < num1; i++) {
//			num += (num1 - i) * i;
//			
//		}
//		 System.out.println(num);

		// (77*1)+(76*2)+...+(1*77)를 계산

		// 곱셈결과를 누적시킬 공간 만들기

		int sum = 0;
		int num = 1;
 
		for (int i = 77; i >= 1; i--) {        // i : 77 ---> 1
			sum += i * num;
			num++;                             // num : 1 ---> 77
		}
		System.out.println(sum);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
