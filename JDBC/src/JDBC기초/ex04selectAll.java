package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex04selectAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("  ==== 전체 회원 조회 ====");
		System.out.println("ID      이름     나이     점수");

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

//			if (conn != null) {
//				System.out.println("연결 성공 !!");
//			} else {
//				System.out.println("연결 실패 ..");
//			}

			String sql = "select * from bigdatamember ";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
					String uId = rs.getString("id");
					String uName = rs.getString("name");
					int uAge = rs.getInt("age");
					int uScore = rs.getInt("score");
					System.out.println(uId + "\t" + uName + "\t" + uAge + "\t" + uScore);
				} 

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
