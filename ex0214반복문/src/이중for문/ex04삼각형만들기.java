package 이중for문;

public class ex04삼각형만들기 {

	public static void main(String[] args) {

		for (int j = 1; j < 6; j++) {
			for (int i = 5; i > 0; i--) {
				if (i > j) {
					System.out.print(" ");

				} else
					System.out.print("*");
			}
			for (int i = 2; i < 6; i++) {
				if (i > j) {
					System.out.print(" ");

				} else
					System.out.print("*");
			}
			System.out.println();
		}

//		for (int k = 1; k < 4; k++) {
//			for (int i = 4; i > 0; i--) {
//				if (i > k) {
//					System.out.print("*");
//				} else
//					System.out.print(" ");
//			}
//				for (int h = 4; h > 0; h--) {
//					if (h > k) {
//						System.out.print("*");
//					} else
//						System.out.print(" ");
//				}
//				System.out.println();
//
//			}
//		}

//				for (int i = 2; i < 6; i++) {
//					if (i < k) {
//						System.out.print(" ");
//
//					} else
//						System.out.print("*");
//				}
//
//				System.out.println();
//			}
//
//		}

	}

}
