package 닌텐도게임;

public class GameMain {
	// 닌텐도게임시(실행할 수 있는 공간)
	
	public static void main(String[] args) {
		// 추상 클래스는 객체 생성이 불가능하다 !
//		Dongmul d = new Dongmul();
		
		// 마리오 게임칩 꺼내오기
		Mario m = new Mario();
		// 게임칩을 넣기
		on(m);
		// 젤다 게임칩 꺼내오기 / (업캐스팅)
		Zelda z = new Zelda();
		// 게임칩을 넣기
		on(z);
		// Mario m = new Zelda(); --> 업캐스팅
		// PokemonGo 게임칩 꺼내오기 / (다운캐스팅)
		PokemonGo p1 = new PokemonGo();
		PokemonGo p = (PokemonGo)p1;
		// 게임칩을 넣기
		on(p);
		
	}

	// 게임칩을 넣어서 작동시키는 메소드
	private static void on(GameChip m) {
		m.gameStart();
	}
	
//  메소드 오버로딩 기법 사용
	
//	private static void on(Zelda z) {
//		z.gameStart();
//	}
//	private static void on(PokemonGo p) {
//		p.gameStart();
//	}
	
	
	
	
	
	
}
