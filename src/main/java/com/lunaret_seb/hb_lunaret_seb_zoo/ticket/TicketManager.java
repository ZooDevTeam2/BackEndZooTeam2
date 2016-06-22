package com.lunaret_seb.hb_lunaret_seb_zoo.ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketManager implements ITicket {
	
	private static List<Ticket> ListTicket;
	
	private static List<Ticket> ListTicket() {
		return ListTicket;
	}
	
	public TicketManager() {
		
		ListTicket = new ArrayList<Ticket>();
		
		ListTicket.add(new Ticket("Tarif normal", 8, 1));
		ListTicket.add(new Ticket("Tarif réduit", 6, 2));
		ListTicket.add(new Ticket("Tarif enfant", 5, 3));
		ListTicket.add(new Ticket("Tarif carnet 10", 65, 4));
		ListTicket.add(new Ticket("Tarif groupe adultes", 55, 5));
		ListTicket.add(new Ticket("Tarif groupe scolaire", 80, 6));
		ListTicket.add(new Ticket("Tarif groupe étudiant", 85, 7));
		
	}

	@Override
	public Ticket getByIndex(int index) {
		return ListTicket.get(index - 1);
	}

	@Override
	public List<Ticket> getAll() {
		return ListTicket;
	}

	@Override
	public void add(Ticket ticket) {
		ListTicket.add(ticket);
	}

	@Override
	public void update(Ticket ticket, int position) {
		ListTicket.remove(position);
		ListTicket.add(ticket);
	}

	@Override
	public void remove(int position) {
		ListTicket.remove(position);
	}

}
