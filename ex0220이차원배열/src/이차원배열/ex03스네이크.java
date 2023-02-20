package 이차원배열;

public class ex03스네이크 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		int num = 21;

		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < 5; i++) {
					arr[j][i] = num++;
				}
			} else if (j % 2 == 1) {
				for (int i = 4; i >= 0; i--) {
					arr[j][i] = num++;
				}
			}
		}

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
