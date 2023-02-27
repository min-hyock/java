package 추상클래스;

public class PartTimeEmployee extends Employee {

	private int workDay;

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay); // 부모 클래스의 생성자를 호출
		this.workDay = workDay;
	}

	public int getMoneyPay() {
		return pay * workDay;
	}

}
