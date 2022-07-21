package GodMins;

import java.sql.Connection;
import java.sql.SQLException;

import gg.DBUtil;

public class BookService {
	private BookDaoParamConn dao;
	
	public BookService(BookDaoParamConn dao) {
		super();
		this.dao = dao;
	}
	
	public void setDao(BookDaoParamConn dao) {
		
	}
	
	// 신간이 추가되면 비슷한 이름의 책 할인
	public void insertAndUpdate(String title, int price) {
		Connection conn = null;
		
		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			dao.update(conn, "%" + title + "%", price);
			dao.insert(conn, title, price);
			conn.commit();
		} catch (SQLException e){
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException el) {
				el.printStackTrace();
			}
		} finally {
			DBUtil.closeConn(conn);
		}
	}
	
}
