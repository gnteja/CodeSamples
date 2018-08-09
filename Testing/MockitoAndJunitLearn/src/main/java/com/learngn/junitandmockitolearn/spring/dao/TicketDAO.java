package com.learngn.junitandmockitolearn.spring.dao;

import org.springframework.stereotype.Component;

import com.learngn.junitandmockitolearn.spring.dto.Ticket;

@Component
public interface TicketDAO {
	
	int createTicket(Ticket ticket);

}
