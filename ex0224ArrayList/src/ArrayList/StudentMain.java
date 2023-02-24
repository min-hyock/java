package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 자료형을 보관할 수 있는 sList라는 이름을 가진 ArrayList 생성
		
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(짝꿍 이름, 나이를 가지고 있는 데이터를 추가)
//		Student s1 = new Student("기드온", 26);
//		sList.add(s1);
		sList.add(new Student("기드온", 26));
		
		// 3. 짝꿍의 이름 출력
		System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 확인할 것
		// sList.get(0) --> return type : Student --> 객체
		
		// 4. 팀원들 데이터 전부 추가하기
		sList.add(new Student("김 윤", 26));
		sList.add(new Student("맹성영", 26));
		sList.add(new Student("우민철", 26));
		sList.add(new Student("정민규", 26));
		
		
		// 4. 팀원 이름 전부 출력하기
		for (Student s : sList) {
			System.out.println(s.getName());
		}
		
		
		
	}

}
