package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

import model.MemberDTO;

public class MemberDAO {
	// Controller 역할 담당
	// 필드
	private ResultSet rs = null;
	private Connection conn = null;
	private PreparedStatement psmt = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메소드
	private void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClose() {
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

	// 회원가입 메소드
	public int join(MemberDTO dto) {

		int row = 0;

		try {
			getConn();

			String sql = "INSERT INTO BIGDATAMEMBER (ID, PW, NAME, AGE, SCORE) VALUES (?, ?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 로그인 메소드
	public String login(MemberDTO dto) {

		String uName = null;

		try {
			getConn();

			String sql = "select * from bigdatamember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				uName = rs.getString("name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return uName;
	}

	// 회원 삭제 메소드
	public int delete(MemberDTO dto) {
		int row = 0;

		try {
			getConn();

			String sql = "delete from bigdatamember where id = ? and pw = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 회원정보수정 메소드
	public int update(MemberDTO dto) {
		int row = 0;

		try {
			getConn();
			
			Random ran = new Random();
			int java = ran.nextInt(25)+1;
			
			String sql = "update bigdatamember set score = ? where id = ? and pw = ? ";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getScore());
			psmt.setString(2, dto.getId());
			psmt.setInt(3, java);

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	// 전체 회원 조회 메소드
	public ArrayList<MemberDTO> findAll() {
		MemberDTO dto = null;
		ArrayList<MemberDTO>list = new ArrayList<MemberDTO>();
		
		try {
			getConn();

			String sql = "select * from bigdatamember ";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String Id = rs.getString("id");
				String Name = rs.getString("name");
				int Age = rs.getInt("age");
				int Score = rs.getInt("score");
				dto = new MemberDTO(Id, Name, Age, Score);
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return list;
	}
}
