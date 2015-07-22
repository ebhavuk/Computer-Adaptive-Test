package cat.xebia.dao;

import java.util.List;
import java.util.Map;

public interface CatDAO {
	
	List<Map<String, Object>> getPassword(String username);

	String signUp(String name,String username, String email, String organisation, String password);

	String insertques(String question, String questionlevel, String option1, String option2,
			String option3, String option4, String answer, String category);


}
