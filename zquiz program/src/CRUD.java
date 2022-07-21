import java.sql.SQLException;
import java.util.List;

public interface CRUD {
int create(String question, String awnser, String hint) throws SQLException;
	
	List<fourletters> read() throws SQLException;
	
	int update(int number, String question, String awnser, String hint) throws SQLException;
	
	int delete(int number) throws SQLException;
}
