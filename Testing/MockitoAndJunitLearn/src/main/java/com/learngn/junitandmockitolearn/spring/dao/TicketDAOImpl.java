package com.learngn.junitandmockitolearn.spring.dao;

import org.springframework.stereotype.Component;

import com.learngn.junitandmockitolearn.spring.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	public int createTicket(Ticket ticket) {
		return 1;
	}
}
