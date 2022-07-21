import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import gg.DBUtil;

public class FileUpload {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO files (id, name, file) VALUES (?, ?, ?)");
			pstmt.setInt(1, 1000);
			pstmt.setString(2, "파일이름");
			pstmt.setBlob(3, new FileInputStream(new File("D:\\춘식\\춘식1.png")));
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
	}
}
