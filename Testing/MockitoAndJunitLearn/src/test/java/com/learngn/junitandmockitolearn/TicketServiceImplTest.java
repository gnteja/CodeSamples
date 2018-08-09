package com.learngn.junitandmockitolearn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learngn.junitandmockitolearn.spring.dao.TicketDAO;
import com.learngn.junitandmockitolearn.spring.dto.Ticket;
import com.learngn.junitandmockitolearn.spring.service.TicketServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TicketServiceImplTest {

	private static final int RESULT = 1;
	private static final String PHONE = "123456778";
	private static final String PASSENGER_NAME = "Gn Teja";
	
	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	private TicketServiceImpl service;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void buyTicketShouldReturnsAValidResult() {
	
		when(dao.createTicket(any(Ticket.class))).thenReturn(1);
		int result = service.buyTicket(PASSENGER_NAME, PHONE);
		assertEquals(result, RESULT);
	}

}
