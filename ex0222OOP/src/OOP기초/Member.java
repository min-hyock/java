package OOP기초;

public class Member {
	// 나만의 자료형 설계도면.
	// ---> main method 포함 X
	// ---> 자체적으로 실행되지는 않음.
	// ---> 설계도면 그 이상 그 이하도 아님.
	// OOP(Object Oriented Programming)

	// 1. Field(Data, 속성)

	String name; // 이름
	int age; // 나이
	String id; // 아이디
	String pw; // 비밀번호

	// 2. Method(Logic, 행위, 기능)
	// 카카오톡 메세지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name + " 님이" + msg + "를 전송합니다.");
	}

	// 기프티콘 보내기
	public void sendGift(String gift) {
		System.out.println(name + " 님이" + gift + "를 선물합니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}