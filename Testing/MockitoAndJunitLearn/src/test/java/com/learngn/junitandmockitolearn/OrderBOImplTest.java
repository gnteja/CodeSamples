package com.learngn.junitandmockitolearn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.learngn.junitandmockitolearn.mockito.bo.OrderBOImpl;
import com.learngn.junitandmockitolearn.mockito.bo.exception.BOException;
import com.learngn.junitandmockitolearn.mockito.dao.OrderDao;
import com.learngn.junitandmockitolearn.mockito.dto.Order;

public class OrderBOImplTest {
	
	@Mock
	OrderDao dao;
	
	
	private OrderBOImpl bo;
	private Order order;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
		bo = new OrderBOImpl(dao);
		order = new Order();
	}

	@Test
	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException
	{
		when(dao.create(any(Order.class))).thenReturn(new Integer(1));
		boolean result = bo.placeOrder(any(Order.class));
		
		assertFalse(result);
		verify(dao,times(1)).create(any(Order.class));
	}
	
	@Test
	public void placeOrder_Should_Not_Create_An_Order() throws SQLException, BOException
	{

		when(dao.create(order)).thenReturn(new Integer(0));
		boolean result = bo.placeOrder(order);
		
		assertFalse(result);
		verify(dao,atLeast(1)).create(order);
	}
	
	@Test(expected = BOException.class)
	public void placeOrder_Should_Throw_An_Exception() throws SQLException, BOException
	{
		when(dao.create(order)).thenThrow(SQLException.class);
		bo.placeOrder(order);
	}
	
	@Test
	public void cancelOrder_Should_Cancel_An_Order() throws SQLException, BOException 
	{
		Order order = new Order();
		when(dao.read(anyInt())).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		boolean result = bo.cancelOrder(anyInt());
		
		assertTrue(result);
		
		verify(dao).read(anyInt());
		verify(dao).update(order);
	}

	@Test
	public void cancelOrder_Should_Not_Cancel_An_Order() throws SQLException, BOException 
	{
		Order order = new Order();
		when(dao.read(12)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		boolean result = bo.cancelOrder(12);
		
		assertFalse(result);
		
		verify(dao).read(12);
		verify(dao).update(order);
	}
	
	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_BOException() throws SQLException, BOException 
	{
		Order order = new Order();
		when(dao.read(12)).thenThrow(SQLException.class);
		bo.cancelOrder(12);
	}
	
	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_BOException_On_Update() throws SQLException, BOException 
	{
		Order order = new Order();
		when(dao.read(12)).thenReturn(order);
		when(dao.update(order)).thenThrow(SQLException.class);
		bo.cancelOrder(12);
		
	}
	
	@Test
	public void deleteOrder_Deletes_The_Order() throws SQLException, BOException {
		when(dao.delete(12)).thenReturn(1);
		boolean result = bo.deleteOrder(12);
		assertTrue(result);
		verify(dao).delete(12);
	}
	
}
