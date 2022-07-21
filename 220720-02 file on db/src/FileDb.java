import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import gg.DBUtil;

public class FileDb {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// DB에 있는 파일을 자바를 통해 내려 받음
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM files WHERE id = ?");
			pstmt.setInt(1, 1000);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				// db시스템 적인 관리측면에서 다른 정보들도 함께 관리함
				Blob file = rs.getBlob("file");
				// blob은 2진 정보를 저장하고 있는 타입
				// blob은 sql 패키지의 하나의 타입으로 존재함
				
									//2진데이터를 호출할 수 있음 (getBinaryStream)
				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운로드받은거.png"));
				// 복사를 시켜줌
				
				int b = 0;
				while ( ( b = inputStream.read() ) != -1 ) {
					fos.write(b);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}	
		
//		try {
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement("INSERT INTO files (id, name, file) VALUES (?, ?, ?)");
//			pstmt.setInt(1, 1000);
//			pstmt.setString(2, "파일이름");
//			pstmt.setBlob(3, new FileInputStream(new File("춘식1.png")));
//			
//			pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.closeStmt(pstmt);
//			DBUtil.closeConn(conn);
//		}
	}
}
