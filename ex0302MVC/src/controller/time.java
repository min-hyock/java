package controller;

public class time {

	static String timer; //경과시간 문자열이 저장될 변수
	static int oldTime; //타이머가 ON이 되었을 때 시간을 기억하고 있는 변수

	public static void stopWatch(int onAndOFF) {
		if(onAndOFF == 1)  //타이머 켜다
			oldTime = (int)System.currentTimeMillis() / 1000;

		if(onAndOFF == 0) //타이머 끄고 난 후 secToHHMMSS메서드에 초단위 전달
			secToHHMMSS (((int) System.currentTimeMillis() / 1000) - oldTime);
	}

	//초단위 입력받아서 문자열 형식으로 시분초를 -> timer 변수에 저장
	public static void secToHHMMSS(int secs) {
		int hour, min, sec;

		hour = secs / 3600; //시
		min = secs / 60 % 60; //분
		sec = secs  % 60;  //초

		timer = String.format("%02d:%02d:%02d", hour,min,sec);
	}

	public static void Waiting() { //유저가 Enter키 누를 때까지 무한정 대기 
		try {
			
			System.in.read(); 
			
		}catch (Exception e) {}
	}
	
	
	public static void main(String[] args) {

		System.out.println("***** StopWatch *****");
		System.out.println("Timer ON! 엔터 키를 누르면 종료합니다.");
		stopWatch(1); //타이머 켜다
		
		
		Waiting(); //엔터 키 누를 때까지 대기
		
		stopWatch(0); //타이머 끄다
		System.out.format("Timer OFF! 경과 시간: [%s]%n", timer); // 경과 시간 화면에 출력

	}

}