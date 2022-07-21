package GodMins;
import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl();
		
		try {
//			int result = dao.create("테스트중1", "1234-5555", "부산 어쩌구");
//			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(1));
			
//			int result = dao.update(1, "대대모골", "01045789632", "3분거리");
//			System.out.println(dao.read(1));
//			System.out.println(dao.read());
			
//			dao.delete(12);
//			System.out.println(dao.read());
			
			//다운캐스팅의 이유는 추가한 크리에이트는 인터페이스를 하지 않아서
			RestaurantsDaoImpl imlp = (RestaurantsDaoImpl) dao;
			int[] result = imlp.create(Arrays.asList(
					new Restaurant(0, "배치1", "0101010" , "4번지")
					,new Restaurant(0, "배치2", "0102010" , "5번지")
					,new Restaurant(0, "배치3", "0101030" , "6번지")
			));
			System.out.println(Arrays.toString(result));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
