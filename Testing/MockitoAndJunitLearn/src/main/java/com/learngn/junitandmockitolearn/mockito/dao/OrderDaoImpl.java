package com.learngn.junitandmockitolearn.mockito.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.learngn.junitandmockitolearn.mockito.dto.Order;

@Component
public class OrderDaoImpl implements OrderDao {	

	@Override
	public int create(Order order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order read(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Order order) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
