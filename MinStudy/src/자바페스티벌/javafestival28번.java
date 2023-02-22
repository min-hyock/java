package 자바페스티벌;

public class javafestival28번 {

	public static void main(String[] args) {

		String str = "01001101";
//
//		int result = Integer.parseInt(str, 2);
//
//		System.out.println(str + "(2)" + " = " + result + "(10)");

		// 1. 문자열을 연산이 가능한 구조로 변경

		String[] result = str.split("");

		// 2. 지수를 세어 줄 수 있는 변수 생성

		int j = 0;

		// 지수값이 다 계산된 값들을 누적할 수 있는 공간

		int total = 0;

		// 3. 반복문을 사용하여 계산해야하는 구조 만들기
		for (int i = result.length - 1; i >= 0; i--) {
			// 문자를 숫자형으로 형변환하기
			int num = Integer.parseInt(result[i]);
			// num -> 1 -> 1의 0승 값 계산
			total += Math.pow(2, j) * num;
			j++;

		}System.out.println(str+"(2) = "+total+"(10)");

	}
}