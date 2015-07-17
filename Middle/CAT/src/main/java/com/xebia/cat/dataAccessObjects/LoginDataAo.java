package com.xebia.cat.dataAccessObjects;

import com.xebia.cat.controller.model.Login;
import com.xebia.cat.controller.model.SignUp;

public interface LoginDataAo {
	public void insert(SignUp signup);
	public Login findByusername(String username);

}
