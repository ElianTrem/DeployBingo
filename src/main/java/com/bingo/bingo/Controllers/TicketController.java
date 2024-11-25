package com.bingo.bingo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bingo.bingo.Models.TicketModel;
import com.bingo.bingo.Services.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/all")
    public List<TicketModel> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping("/insert")
    public TicketModel insertTicket(@RequestBody TicketModel ticket) {
        return ticketService.insertTicket(ticket);
    }

    @PutMapping("/edit")
    public TicketModel updateTicket(@RequestBody TicketModel ticket) {
        return ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/delete/{idTicket}")
    public Optional<TicketModel> deleteTicket(@PathVariable int idTicket) {
        return ticketService.deleteTicket(idTicket);
    }
}

