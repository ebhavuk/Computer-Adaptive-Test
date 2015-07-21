package cat.xebia.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cat.xebia.dao.CatDAO;

public class CATServiceImpl implements CATService {

	@Autowired
	CatDAO databaseDAO;

	

	@Override
	public List<Map<String, Object>> getPassword(String email) {
		
		return databaseDAO.getPassword(email);
	

	}


	@Override
	public String signUp(String name,String username, String email, String password, String organisation) {
		// TODO Auto-generated method stub
		return databaseDAO.signUp(name,username,email,password,organisation);
	}

	


	@Override
	public String insertques(String question, String questionlevel, String option1, String option2,
			String option3, String option4, String answer, String category) {
		// TODO Auto-generated method stub
		return databaseDAO.insertques(question, questionlevel, option1, option2, option3,option4,answer,category);

	}




}
