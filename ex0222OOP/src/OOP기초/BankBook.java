package OOP기초;

public class BankBook {
	// 은행 프로그램 만든다고 가정
	// 통장 정보를 저장할 수 있는 우리만의 자료형 설계도면
	
	// 1. Field(Data, 속성)
	// 잔액(money)
	int money;
	
	// 이름(name)
	String name;
	
	// 2. Method(Logic, 기능, 행위)
	// 입금하다(deposit)
	// --> return type 없음, 매개변수로 정수형 하나 받아오기
	// 	   로직은 아직 적지 말 것!
	public void dePosit(int num) {
		
	}
	// 출금하다(withdraw)
	// --> return type 없음, 매개변수로 정수형 하나 받아오기
	// 	   로직은 아직 적지 말 것!
	public void withDraw(int num) {
		
	}
	// 잔액확인하기(showMoney)
	// --> return type 있음, int 형태를 되돌려주기
	// 	   매개변수는 없음, 현재 잔액을 리턴.
	public int showMoney() {
		int nowMoney = money;
		
		return nowMoney;
	}
	
	
	
	
	
	
}
