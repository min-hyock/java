package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex05Update {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// id, pw, 수정할 점수
		System.out.println(" ==== 회원 정보 수정 ==== ");

		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();
		System.out.print("수정할 점수를 입력하세요 : ");
		int update = sc.nextInt();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "update bigdatamember set score = ? where id = ? and pw = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, update);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원 정보가 수정 되었습니다.");
			} else {
				System.out.println("입력하신 정보가 잘못 되었습니다.");
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
