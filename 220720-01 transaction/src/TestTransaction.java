import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import gg.DBUtil;

public class TestTransaction {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		try {			
			conn = DBUtil.getConnection();
			//트랜잭션
			//커넥션에 연결해서 사용 할 수 있음
			conn.setAutoCommit(false);
			// 이렇게 false 값을 주면 트랜잭션이 만들어짐
			
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt = conn.prepareStatement("UPDATE books SET title = ?, price = ? WHERE title = ?");
			
			for (int i = 0; i < 5; i++) {
				pstmt.setString(1, i + "번째 책");
				pstmt.setInt(2, 1000 * i);
				pstmt.addBatch();
			}
			
			pstmt2.setString(1, "책1");
			pstmt2.setInt(2, 50000);
			pstmt2.setString(3, "1번째 책");
			
			pstmt.executeBatch();
			pstmt2.executeUpdate();
			
			//프로그램 흐름이 여기까지
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
}
