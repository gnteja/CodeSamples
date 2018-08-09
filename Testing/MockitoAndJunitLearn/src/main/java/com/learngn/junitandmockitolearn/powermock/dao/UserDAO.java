package com.learngn.junitandmockitolearn.powermock.dao;

import com.learngn.junitandmockitolearn.powermock.dto.User;
import com.learngn.junitandmockitolearn.powermock.util.IDGenerator;

public class UserDAO {
	
	public int createUser(User user) {
		int id = IDGenerator.generateID();
		return id;
	}

}
