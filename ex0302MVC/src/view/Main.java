package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import controller.MemberDAO;
import model.MemberDTO;

public class Main {
	// View 담당

	public static void main(String[] args) {
		// 디자인 패턴 : 계속 같은 문제가 발생하여, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여주지는 부분
		// Controller : 실제 기능이 일어나는 부분
		Scanner sc = new Scanner(System.in);
		System.out.println(" ==== SMHRD 회원관리 프로그램 ====");
		// [1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정
		// 1,2,3,4,5를 제외한 숫자를 입력하면 종료
		long start = System.currentTimeMillis(); 
		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정 >> ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println(" ==== 회 원 가 입 ====");
				// 사용자 입출력 구간
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("점수 입력 : ");
				int score = sc.nextInt();

				// 데이터베이스에 접근해서 데이터 추가하기 !
				// --> 앞으로 데이터베이스 접근과 관련된 모든 역할은 DAO 담당 !
				// 1) DAO 꺼내오기
				MemberDAO dao = new MemberDAO();

				// 2) DAO에게 보내줄 데이터 하나로 묶어주기
				MemberDTO dto = new MemberDTO(id, pw, name, age, score);

				// 3) 회원가입 기능 사용하기
				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패..");
				}

			} else if (choice == 2) {
				System.out.println(" ==== 로  그  인 ====");
				// 1. 사용자에게 입력 받기
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// 2. DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				// 3. DAO가 가지고있는 로그인 기능 사용하기
				MemberDTO dto = new MemberDTO(id, pw);
				String uName = dao.login(dto);
				// 4. 로그인 성공 실패여부 판단 출력
				if (uName != null) {
					System.out.println(uName + "님 환영합니다 ~");
				} else {
					System.out.println("로그인 실패");
					System.out.println("아이디 비밀번호를 확인해주세요");
				}

			} else if (choice == 3) {
				System.out.println(" ==== 회 원 탈 퇴 ====");

				System.out.println("삭제할 ID, PW를 입력해주세요");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				MemberDAO dao = new MemberDAO();

				MemberDTO dto = new MemberDTO(id, pw);
				int row = dao.delete(dto);

				if (row > 0) {
					System.out.println("입력한 회원정보가 삭제 되었습니다.");
				} else {
					System.out.println("아이디 패스워드를 확인해주세요.");
				}

			} else if (choice == 4) {
				System.out.println(" ==== 전체회원조회 ====");
				System.out.println("ID      이름     나이     점수");

				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.findAll();

				for (MemberDTO dto : list) {
					System.out.print(dto.getId() + "\t");
					System.out.print(dto.getName() + "\t");
					System.out.print(dto.getAge() + "\t");
					System.out.println(dto.getScore() + "\t");
				}

			} else if (choice == 5) {
				System.out.println(" ==== 회원정보수정 ====");

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("수정할 점수를 입력하세요 : ");
				int nScore = sc.nextInt();

				MemberDAO dao = new MemberDAO();

				MemberDTO dto = new MemberDTO(id, pw, nScore);
				int row = dao.update(dto);

				if (row > 0) {
					System.out.println("회원 정보가 수정 되었습니다.");
				} else {
					System.out.println("입력하신 정보가 잘못 되었습니다.");
				}

			} else {
				
				ArrayList a = new ArrayList();

		        for(int i=0;i<10000000;i++){
		            a.add(new Random().nextInt());
		        }

		        long end = System.currentTimeMillis();
		        
		        int result = (int) (end - start); 
		        
//		        System.out.println("start : " + start); //시작시간의 밀리세컨드
//		        System.out.println("end : " + end);  //종료시간의 밀리케선드
		        System.out.println( "총 걸린 시간 : " + ( result )/1000 +"초"); //최종 실행시간
				System.out.println("종료되었습니다");

				break;
			}
			

	        

		}

	}

}
