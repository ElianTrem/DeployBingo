package com.bingo.bingo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bingo.bingo.Models.TicketModel;
import com.bingo.bingo.Repositories.TicketRepository;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketModel> getAllTickets() {
        return ticketRepository.findAll();
    }

    public TicketModel insertTicket(TicketModel ticket) {
        return ticketRepository.save(ticket);
    }

    public TicketModel updateTicket(TicketModel ticket) {
        return ticketRepository.save(ticket);
    }

    public Optional<TicketModel> deleteTicket(int idTicket) {
        Optional<TicketModel> ticket = ticketRepository.findById(idTicket);
        try {
            ticketRepository.deleteById(idTicket);
        } catch (Exception e) {
            return null;
        }
        return ticket;
    }
}

