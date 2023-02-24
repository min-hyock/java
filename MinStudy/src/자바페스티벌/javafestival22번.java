package 자바페스티벌;

public class javafestival22번 {

	public static void main(String[] args) {

		for (int j = 1; j < 6; j++) {
			for (int i = 5; i > 0; i--) {
				if (i > j) {
					System.out.print(" ");

				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
