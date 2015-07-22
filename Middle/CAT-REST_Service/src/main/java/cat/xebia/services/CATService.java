package cat.xebia.services;

import java.util.List;
import java.util.Map;

public interface CATService {

	List<Map<String, Object>> getPassword(String username);

	String signUp(String name, String username, String email, String password, String organisation);

	String insertques(String question, String questionlevel, String option1, String option2, String option3,
			String option4, String answer, String category);

	List<Map<String, Object>> nextques(String question, String questionlevel, String answer, String category);

}
