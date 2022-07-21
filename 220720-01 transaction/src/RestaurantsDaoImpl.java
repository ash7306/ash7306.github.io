

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import gg.DBUtil;

public class RestaurantsDaoImpl implements RestaurantsDao {
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getNString("name");
		String phoneNumber = rs.getString("phoneNumber");
		String address = rs.getString("address");
		// ResultSet은 한 행을 읽을 수 있게 도와주는 객체
		
		return new Restaurant(id, name, phoneNumber, address);
	}
		
	//추가를 여러번 할수 있게
	public int[] create(List<Restaurant> list) throws SQLException {
		String query = "INSERT INTO restaurant (name, phoneNumber, address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for (Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getPhoneNumber());
				pstmt.setString(3, r.getAddress());
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
	public int create(String name, String phoneNumber, String address) throws SQLException {
		String query = "INSERT INTO restaurant (name, phoneNumber, address) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	
	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<Restaurant>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			//익스큐트쿼리를 실행해서 행과 열을 읽을수 있게 도와주는
			//리절트셋을 반환 받아서
			//불련 값을 가지는 넥스트라는 메소드로 읽게 해줌

			//다음줄이 있는지 알려줌 (boolean 값으로)
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

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<Restaurant>();
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			//?준비
			pstmt.setInt(1, id);
			//준비끝나면 실행(빈파라미터)
			rs = pstmt.executeQuery();

			//한행이 있다면
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

		return null;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "UPDATE restaurant SET name = ?, phoneNumber = ?, address = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
//		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		String query = "DELETE FROM restaurant WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			// 준비과정을 set으로
			pstmt.setInt(1, id);

			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

}
