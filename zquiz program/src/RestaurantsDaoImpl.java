

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gg.DBUtil;

public class RestaurantsDaoImpl implements CRUD {
	private fourletters resultMapping(ResultSet rs) throws SQLException {
		int number = rs.getInt("number");
		String question = rs.getNString("question");
		String awnser = rs.getString("awnser");
		String hint = rs.getString("hint");
		// ResultSet은 한 행을 읽을 수 있게 도와주는 객체
		
		return new fourletters(number, question, awnser, hint);
	}
		
	//추가를 여러번 할수 있게
	public int[] create(List<fourletters> list) throws SQLException {
		String query = "INSERT INTO fourletters (question, awnser, hint) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (fourletters f : list) {
				pstmt.setString(1, f.getQuestion());
				pstmt.setString(2, f.getAwnser());
				pstmt.setString(3, f.getHint());
				pstmt.addBatch();
				//스테이트먼트가 한줄을 준비하고 반복하면 그 반복을 더해서 준비해줌
				//같은 쿼리문으로 한것을
				//똑같은 작업 여러번 할때 배치
			}
			//익스큐트배치는반복문으로 실행된 것을 한번에 실행하게끔 함
			return pstmt.executeBatch();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
	}
	
	@Override
	public int create(String question, String awnser, String hint) throws SQLException {
		String query = "INSERT INTO fourletters (question, awnser, hint) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setString(1, question);
			pstmt.setString(2, awnser);
			pstmt.setString(3, hint);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	
	@Override
	public List<fourletters> read() throws SQLException {
		String query = "SELECT * FROM fourletters";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<fourletters> list = new ArrayList<fourletters>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

		return list;

	}

//	@Override
//	public fourletters read(int number) throws SQLException {
//		String query = "SELECT * FROM fourletters WHERE number = ?";
//
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		List<fourletters> list = new ArrayList<fourletters>();
//		
//		try {
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement(query);
//			//?준비
//			pstmt.setInt(1, id);
//			//준비끝나면 실행(빈파라미터)
//			rs = pstmt.executeQuery();
//
//			//한행이 있다면
//			if (rs.next()) {
//				return resultMapping(rs);
//			}
//		} finally {
//			DBUtil.closeRs(rs);
//			DBUtil.closeStmt(pstmt);
//			DBUtil.closeConn(conn);
//		}
//
//		return null;
//	}

	@Override
	public int update(int number, String question, String awnser, String hint) throws SQLException {
		String query = "UPDATE fourletters SET question = ?, awnser = ?, hint = ? WHERE number = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setString(1, question);
			pstmt.setString(2, awnser);
			pstmt.setString(3, hint);
			pstmt.setInt(4, number);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
//		return 0;
	}

	@Override
	public int delete(int number) throws SQLException {
		String query = "DELETE FROM fourletters WHERE number = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setInt(1, number);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
