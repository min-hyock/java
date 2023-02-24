package 객체배열;

public class Main {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 배열이름 = new 자료형[칸수];
		// 포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성

		Pokemon[] bag = new Pokemon[3];

		// 객체 배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println(bag[0]);

		// 객체 배열의 0번 인덱스에 포켓몬을 넣어보기
		// 이름 : 피카츄/ 스킬 : 백만볼트 / 타입 : 전기
		// hp : 2500 / atk : 250

//		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 2500, 250);
//		bag[0] = pika;

		// 1번 인덱스 >> 파이리/불/화염방사/1000/100
		// 2번 인덱스 >> 꼬부기/물/물대포/1500/150

		bag[0] = new Pokemon("피카츄", "전기", "백만볼트", 2500, 250);
		bag[1] = new Pokemon("파이리", "불", "화염방사", 1000, 100);
		bag[2] = new Pokemon("꼬부기", "물", "물대포", 1500, 150);

		System.out.println(bag[0].getName());

		System.out.println("=== 포켓몬 정보 출력 ===");
		for (int i = 0; i < bag.length; i++) {
			System.out.println(bag[i].getName() + " " + bag[i].getType() + " " + bag[i].getHp());
		}
		System.out.println();
//		System.out.println(bag[0].getName()+" "+bag[0].getType()+" "+bag[0].getHp());
//		System.out.println(bag[1].getName()+" "+bag[1].getType()+" "+bag[1].getHp());
//		System.out.println(bag[2].getName()+" "+bag[2].getType()+" "+bag[2].getHp());

		// for - each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용한다.
		// 동작 원리 > 배열 안에 저장되어있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준 왼쪽에 있는 변수에 담아주는 흐름을 가진다.
		for (Pokemon p : bag) {
			System.out.println(p.getName() + " " + p.getType() + " " + p.getHp());
		}

	}

}
