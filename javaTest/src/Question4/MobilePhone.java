package Question4;

class MobilePhone extends CameraPhone{

	public String phoneNumber;

	public void call() {
		System.out.println("전화걸기");
	}

	public void message() {
		System.out.println("문자보내기");
	}
}
