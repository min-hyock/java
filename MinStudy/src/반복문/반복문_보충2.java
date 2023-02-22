package 반복문;

public class 반복문_보충2 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		// 문자열 -> 하나씩 판단할 수 있는 구조로 변경
		// split("기준") : 기준값으로 문자를 하나하나 나누는 기능

		// 나누어지는 값들은 문자열을 전체적으로 관리할 수 있는
		// 배열에 담아서 기억한다.
		String[] result = score.split(",");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < result.length; i++) {
			if (result[i].equals("A")) {
				a++;
			} else if (result[i].equals("B")) {
				b++;
			} else if (result[i].equals("C")) {
				c++;
			} else if (result[i].equals("D")) {
				d++;
			} else if (result[i].equals("F")) {
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
