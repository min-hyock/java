package 추상클래스;

public abstract class Employee {

	// 접근제한자 : 클래스 변수와 메소드를 외부에서 접근할 수 있는 범위를 지정
	// public >> protected >> default(package) >> private
	// 모든 클래스에서 접근 가능 >> 상속 관계에 있거나, 같은 패키지에 있는 클래스만 접근 가능
	// >> 같은 패키지에 있는 클래스만 접근 가능 >> 외부 클래스 접근 불가

	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉

	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	public String print() {

		return empno + " / " + name + " / " + pay;

	}

}
