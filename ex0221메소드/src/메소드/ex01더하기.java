package 메소드;

public class ex01더하기 {

	public static void main(String[] args) {

		// 메소드 사용하기 ( main 영역 안쪽에서 사용하기)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);

		int minus = subNum(3, 5);
		System.out.println(minus);

		printHello();

	}

	// 메소드 생성 (main 영역을 벗어나서 작성하기)
	// 3. Hello World를 출력하는 메소드
	public static void printHello() {
		// void : 리턴타입이 없음을 의미하는 키워드
		System.out.println("HelloWorld!!");
	}

	// 2. 빼기를 수행하는 메소드
	// 리턴타입 : int / 매개변수 : int 2개 / 메소드명 : subNum
	// 매개변수로 받아온 데이터 두개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과값 돌려주기

	public static int subNum(int n1, int n2) {
		int result = 0;
//		if(n1>n2) {
//			result = n1 - n2;
//		}else if (n2>n1) {
//			result = n2 - n1;
		result = n1 > n2 ? n1 - n2 : n2 - n1;

		return result;
	}

	// 1. 더하기
	// 매개변수 double 2개 / 리턴타입 double / 메소드명 addDouble

	public static double addDouble(double n1, double n2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에만 코드를 작성해야 한다.
		double result = n1 + n2;
		return result;
	}

}
