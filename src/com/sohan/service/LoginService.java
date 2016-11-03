package com.sohan.service;

import java.util.HashMap;
import java.util.Map;

import com.sohan.dto.User;

public class LoginService {

	Map<String, String> users = new HashMap<String, String>();

	public LoginService() {
		users.put("sohanece", "Sohan Lal");
		users.put("jalapsonu", "Sonu Jalap");
		users.put("pankaj.jalap", "Pankaj Jalap");
	}

	public boolean authenticate(String userId, String passwd) {
		if (passwd == null || passwd.trim() == "") {
			return false;
		}
		return true;
	}

	public User getUser(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		return user;
	}
}
