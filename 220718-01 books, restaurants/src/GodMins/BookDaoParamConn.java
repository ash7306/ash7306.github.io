package GodMins;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import gg.DBUtil;

public class BookDaoParamConn {
	public int update(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		//Connection conn = null; 이 생략됨
		//파라미터로 전달 받음
		
		try {
			pstmt = conn.prepareStatement("UPDATE books SET price = ? WHERE title LIKE ?");
			pstmt.setInt(1, price);
			pstmt.setString(2, title);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int insert(Connection conn, String title, int price) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("INSERT INTO books (title, price) VALUES (?, ?)");
			pstmt.setString(1, title);
			pstmt.setInt(2, price);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
	public int delete(Connection conn, int bookId) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement("DELETE FROM books WHERE bookId = ?");
			pstmt.setInt(1, bookId);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
		}
	}
}
