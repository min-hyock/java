package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 사용자로부터 아이디와 비밀번호를 입력받기
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement psmt = null;

		// DB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DB 연결 통로 열기 (url, user, password)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공 !!");
			} else {
				System.out.println("연결 실패 ..");
			}

			// 3. sql문 준비
			// 로그인 >> 테이블에 데이터가 존재하는지 확인 >> select
			// 아이디, 비밀번호가 일치하는 데이터의 모든 컬럼을 가져오기 !
			String sql = "select * from bigdatamember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			// ? 인자 채워주기
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 4. sql문 전송(실핼)

			rs = psmt.executeQuery();
			// ResultSet이란 ?
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료형 구조
			// : cursor를 가지고 있다.(처음에는 column명을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있다.

			// rs.next(); --> cursor를 한행 밑으로 내리는 작업
			// 데이터가 있다면 true, 데이터가 없다면 false
			if (rs.next() == true) {
				// 로그인이 성공했다면
				// 이름 님 환영합니다 ~
				String uName = rs.getString("name");
				System.out.println(uName + "님 환영합니다 ~");
			} else {
				System.out.println("로그인 실패");
				System.out.println("아이디 비밀번호를 확인해주세요");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			try {
				// ★ 열어 준 순서의 반대 !
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
