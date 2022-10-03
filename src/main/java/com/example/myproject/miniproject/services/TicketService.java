package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.dto.TicketDto;
import com.example.myproject.miniproject.entities.Ticket;

import java.util.List;


public interface TicketService {
    Ticket createNewTicket (Ticket request);

    public List<TicketDto> getAllTicket();

}
