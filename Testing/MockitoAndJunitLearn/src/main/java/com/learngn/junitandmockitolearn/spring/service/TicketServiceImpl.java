package com.learngn.junitandmockitolearn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learngn.junitandmockitolearn.spring.dao.TicketDAO;
import com.learngn.junitandmockitolearn.spring.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDAO dao;

	public TicketDAO getDao() {
		return dao;
	}

	@Autowired
	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

	@Override
	public int buyTicket(String passengerName, String phoneNumber) {

		Ticket ticket =  new Ticket();
		
		ticket.setPassengerName(passengerName);
		ticket.setPhoneNumber(phoneNumber);
		return getDao().createTicket(ticket);
	}

}
