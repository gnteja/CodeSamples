package com.learngn.junitandmockitolearn.mockito.bo;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.learngn.junitandmockitolearn.mockito.bo.exception.BOException;
import com.learngn.junitandmockitolearn.mockito.dao.OrderDao;
import com.learngn.junitandmockitolearn.mockito.dto.Order;

@Service
public class OrderBOImpl implements OrderBussinessObject {

	OrderDao orderDao;
	
	public OrderBOImpl() {
		super();
	}
	public OrderBOImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = orderDao.create(order);
			if (result == 0) {
				return false;
			}
			
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		
		try {
			Order read = orderDao.read(id);
			read.setStatus("cancelled");
			int result = orderDao.update(read);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		
		try {
			int result = orderDao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}
}
