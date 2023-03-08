import java.util.Scanner;

public class project문제 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[1]강태우 [2]임경남 [3]김운비 [4]내 자바 지식 보기 >> ");
		int sel = sc.nextInt();

		if (sel == 3) {
			System.out.println("수강할 과목을 선택하세요");
			System.out.print("[1]JAVA \t [2]C++ >> ");
			int sel1 = sc.nextInt();
			if (sel1 == 1) {
				System.out.println("JAVA문제");
			} else if (sel1 == 2) {
				int num = 0;
				while (true) {
					System.out.println("java를 잡아라");
					num++;
					if (num == 3) {
						break;
					}

				}
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
