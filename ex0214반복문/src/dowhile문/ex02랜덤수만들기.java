package dowhile문;

import java.util.Random;

public class ex02랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤 수를 뽑아내는 방법
		// 1. 랜덤한 수를 추출해주는 도구 꺼내오기 !
		Random ran = new Random();

		// 2. 랜덤한 수 생성하기 - 소괄호 안에 원하는 범위 입력
		int ranNum = ran.nextInt(9) + 1;

		System.out.println(ranNum);
		
	}

}
