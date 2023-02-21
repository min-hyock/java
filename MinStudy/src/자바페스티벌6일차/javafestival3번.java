package 자바페스티벌6일차;

public class javafestival3번 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 1;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num++;
			}
		}
		System.out.println("원본");
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		int num1 = 1;

		for (int j = 0; j < 5; j++) {
			for (int i = 4; i >= 0; i--) {
				array[j][i] = num1++;
			}
		}
		System.out.println("90도 회전");
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println();
		}

	}

}
