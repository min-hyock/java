package 배열;

public class ex01배열 {

	public static void main(String[] args) {

		// 배열 : 같은 타입의 여러변수를 하나의 묶음으로 다루는 자료구조
		// 배열의 특징
		// 1. 같은 자료형만 하나로 묶을 수 있다.
		// 2. index번호를 가지고 있다.
		// ---> index는 0부터 시작해서 차례로 1씩 증가한다.
		// 3. 크기가 고정적이다.
		
		
		// 정수형 데이터를 5개 보관할 수 있는 array 배열 생성

		// @ : 주소값

		int[] array = new int[5];

		System.out.println("주소값 : " + array);
		System.out.println(array[0]);

		array[2] = 7;
		System.out.println(array[2]);

		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = { "이민혁", "우민철", "정민규", "김윤", "맹성영" };
		System.out.println(names[0]);

		String[] name = new String[2];
		System.out.println(name[0]);

	}

}
