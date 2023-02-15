package 자바페스티벌;

public class javafestival3_2번 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;

		for (int i = 77; i >= 1; i--) { // i : 77 ---> 1
			sum += i * num;
			num++; // num : 1 ---> 77
		}
		System.out.println(sum);

	}

}
