package com.learngn.junitandmockitolearn.mockito.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.learngn.junitandmockitolearn.mockito.dto.Order;

@Component
public interface OrderDao {
	
	int create(Order order) throws SQLException;
	Order read(int id) throws SQLException;
	int update (Order order) throws SQLException;
	int delete (int id) throws SQLException;
	
}
