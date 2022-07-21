import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gg.DBUtil;

// catch를 쓰지 않고
// throws로 출력 클래스로 던지는 이유?
// 약속을 넘어서는 것은 '예외'로 만들어서 알려 주고 있었음
// 
public class RestaurantsRepo {
	//내부적으로 사용 할 식당 목록 매서드
	private Restaurants resultMapping(ResultSet rs) throws SQLException {
		int resId = rs.getInt("Id");
		String name = rs.getString("name");
		String Number = rs.getString("phoneNumber");
		String address = rs.getString("address");
		
		return new Restaurants(resId, name, Number, address);
	}
	
	//생성
	public int add(Restaurants restaurants) throws SQLException {
		String query = "insert into restaurant (Name, phoneNumber, address) values ('" + restaurants.getName() + "', '" + restaurants.getNumber() + "', '" + restaurants.getAddress() + "');";
		
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query); 
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//목록
	public List<Restaurants> list() throws SQLException {
		String query = "SELECT * FROM restaurant";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<Restaurants> list = new ArrayList<Restaurants>();
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//상호명으로 검색
	public Restaurants selectById(int resId) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE Id = '" + resId + "'";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				return resultMapping(rs);
			} else {
				return null;
			}
			
		}  finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//수정
	public int update(Restaurants restaurants) throws SQLException {
		String query = "UPDATE restaurant SET name = '" + restaurants.getName() + "', phoneNumber = '" + restaurants.getNumber() + "', address = '" + restaurants.getAddress() + "' WHERE Id = " + restaurants.getResId(); 
		
		Connection conn = null;
		Statement stmt = null;

		int result = 0;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(query);
			return result;
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//삭제
	public int delete(int resId) throws SQLException {
		String query = "DELETE from restaurant where Id = " + resId;
		
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
