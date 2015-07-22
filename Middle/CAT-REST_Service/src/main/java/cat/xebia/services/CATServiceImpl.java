package cat.xebia.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cat.xebia.dao.CatDAO;

public class CATServiceImpl implements CATService {

	@Autowired
	CatDAO dataAccessObject;

	

	@Override
	public List<Map<String, Object>> getPassword(String email) {
		
		return dataAccessObject.getPassword(email);
	

	}


	@Override
	public String signUp(String name,String username, String email, String password, String organisation) {
		// TODO Auto-generated method stub
		return dataAccessObject.signUp(name,username,email,password,organisation);
	}

	


	@Override
	public String insertques(String question, String questionlevel, String option1, String option2,
			String option3, String option4, String answer, String category) {
		// TODO Auto-generated method stub
		return dataAccessObject.insertques(question, questionlevel, option1, option2, option3,option4,answer,category);

	}


	@Override
	public List<Map<String, Object>> nextques(String question, String questionlevel, String answer, String category) {
		// TODO Auto-generated method stub
		return null;
	}




}
