package com.xebia.cat.controller.model;

public class Login {

	
	    private String password;
	    private String name;
	     
	    public Login(String name, String password) {
	        super();
	        this.name = name;
	        this.password = password;
	    }
	    public String getpassword() {
	        return password;
	    }
	    public void setId(String password) {
	        this.password = password;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	          
	}
