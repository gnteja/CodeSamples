package com.learngn.junitandmockitolearn.mockito.bo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.learngn.junitandmockitolearn.mockito.bo.exception.BOException;
import com.learngn.junitandmockitolearn.mockito.dto.Order;

@Service
public interface OrderBussinessObject {
	
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
	
}
