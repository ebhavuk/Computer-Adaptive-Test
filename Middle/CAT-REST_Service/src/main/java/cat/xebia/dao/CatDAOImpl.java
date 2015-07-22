package cat.xebia.dao;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CatDAOImpl implements CatDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> getPassword(String username) {
		// TODO Auto-generated method stub
		String sql = "select password from user where username='" + username + "'";
		List<Map<String, Object>> password = jdbcTemplate.queryForList(sql);
		return password;
	}

	@Override
	public String signUp(String name, String username, String email, String password, String organisation) {
		// TODO Auto-generated method stub

		String sql1 = "INSERT INTO `user`(`name`,`username`, `email`,  `password`,`organisation`) VALUES ('" + name
				+ "','" + username + "','" + email + "','" + password + "','" + organisation + "')";
		jdbcTemplate.execute(sql1);
		JSONObject jo = new JSONObject();
		jo.put("Status", "Success");			
		return jo.toString();	
		
	}

	@Override
	public String insertques(String question, String questionlevel, String option1, String option2, String option3,
			String option4, String answer, String category) {
		// TODO Auto-generated method stub
		String sql1 = "INSERT INTO `ques_bank`(`question`, `questionlevel`, `option1`, `option2`, `option3`, `option4`, `answer`, `category`) VALUES ('"
				+ question + "','" + questionlevel + "','" + option1 + "','" + option2 + "','" + option3 + "','" + option4 + "','" + answer + "','" + category + "')";
		jdbcTemplate.execute(sql1);
		String done = "Inserted";
		return done;
	}

}
