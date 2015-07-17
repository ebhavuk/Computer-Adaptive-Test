package com.xebia.cat.dataAccessObjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.xebia.cat.controller.model.Login;
import com.xebia.cat.controller.model.SignUp;

public class DaoImplementation implements LoginDataAo{

	
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;}
	
	
	@Override
	public void insert(SignUp signup) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO signup " +
				"(username, email, password) VALUES (?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, SignUp.getUserame());
			ps.setString(2, SignUp.getEmail());
			ps.setString(3, SignUp.getPassword());
			ps.executeUpdate();
			ps.close();
 
		} catch (SQLException e) {
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}

	@Override
	public Login findByusername(String username) {
		// TODO Auto-generated method stub
		String sql = "SELECT PASSWORD FROM LOGIN WHERE USERNAME = ?";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			Login login = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				login = new Login(
					rs.getString("username"),
					rs.getString("password")
				);
			}
			rs.close();
			ps.close();
			return login;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}}
	}

}
