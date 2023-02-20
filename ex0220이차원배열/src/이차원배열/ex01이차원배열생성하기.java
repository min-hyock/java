package 이차원배열;

public class ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기(정수형 데이터 보관)
		// [행][열]
		int[][] arr = new int[5][5];

		System.out.println(arr); // [ 두개 나오는 주소값
		System.out.println(arr[0]); // 참조에 참조 형태
		System.out.println(arr[0][0]); // 몇번째 행의 몇번 인덱스로 들어갈지

		// 2. 이차원배열 값을 넣으면서 생성
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 3. 이차원배열 안에 값 넣기 !
		int num = 1;

		for (int j = 0; j < arr.length; j++) { // 행
			for (int i = 0; i < arr[j].length; i++) { // 열
				arr[j][i] = num++;
			}
		}

		// 4. 출력
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t");
				// 정규표현식 : 기호가 컴퓨터에서 특정 의미를 갖고 있다.
				// t --> tab
			}
			System.out.println();
		}

		
		
		
		
		
		
		
	}

}
