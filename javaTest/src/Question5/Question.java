package Question5;

public class Question {

	public static void main(String[] args) {
		
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new AirPlane());
		
	}

	private static void goBusan(Vehicle b) {
		b.go();
	}

}
