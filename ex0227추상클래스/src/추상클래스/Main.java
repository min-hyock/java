package 추상클래스;

public class Main {

	public static void main(String[] args) {

		// 실행하는 공간
		
		RegularEmployee regular = new RegularEmployee("0001", "이민혁", 4000, 300);
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay());
		
		TempEmployee temp = new TempEmployee("0002", "김운비", 4000);
		System.out.println(temp.print());
		
		PartTimeEmployee part = new PartTimeEmployee("0003", "채수민", 50, 20);
		System.out.println(part.print());
		
		
		
		
	}

}
