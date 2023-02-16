package 이중for문;

public class ex02별찍기 {

	public static void main(String[] args) {

		for (int j = 1; j < 6; j++) {			// 행을 나타내는 for문
			for (int i = 0; i < j; i++) {   	// 별의 개수를 표현하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		
			System.out.println();
			
		for (int j = 1; j < 6; j++) {
			for (int i = 6; i > j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
