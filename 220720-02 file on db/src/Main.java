import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import gg.DBUtil;

public class Main {
	public static void main(String[] args) {
		
		// try 리소스 문은 try 다음 괄호가 온다
		// 열고 닫고 할 객체의 선언과 초기화가 괄호에 들어감
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM files");) {
			try(ResultSet rs = pstmt.executeQuery();) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		try {
//			conn = 
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
	}
}
