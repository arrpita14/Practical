package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.Util.DBUtil;

public class LoginRepository {
	public String Login(String username, String password) throws SQLException {
		Connection	con = DBUtil.getCon();
		String sql = "select * from login where user_name=? and password=?";
		ResultSet rs = null;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, username);
			pst.setInt(2, Integer.parseInt(password));
			rs = pst.executeQuery();
		} catch (SQLException e) {
			System.out.println("Error from Login Repository: "+e);
			e.printStackTrace();
		}
		return ""+rs.next()+":"+username;
//		return rs.next();
	}
}