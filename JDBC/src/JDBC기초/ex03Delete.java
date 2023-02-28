package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex03Delete {

	public static void main(String[] args) {

		// 1. 사용자한테 id, pw 입력 받기
		Scanner sc = new Scanner(System.in);

		System.out.println("삭제할 ID,PW를 입력해주세요");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		// 회원탈퇴 성공 --> 출력
		// 회원탈퇴 실패 --> 출력

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공 !!");
			} else {
				System.out.println("연결 실패 ..");
			}

			String sql = "delete from bigdatamember where id = ? and pw = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row  = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("입력한 정보가 삭제 되었습니다.");
			} else {
				System.out.println("아이디 패스워드를 확인해주세요.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
