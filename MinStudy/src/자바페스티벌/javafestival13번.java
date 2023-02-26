package 자바페스티벌;

public class javafestival13번 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] output = score.split(",");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < output.length; i++) {
			if (output[i].equals("A")) {
				a++;
			} else if (output[i].equals("B")) {
				b++;
			} else if (output[i].equals("C")) {
				c++;
			} else if (output[i].equals("D")) {
				d++;
			} else if (output[i].equals("F")) {
				f++;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");

	}

}
