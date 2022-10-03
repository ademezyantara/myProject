package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.dto.TicketDto;
import com.example.myproject.miniproject.entities.Ticket;
import com.example.myproject.miniproject.services.impl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    TicketServiceImpl ticketServiceImpl;

    @PostMapping("/addNewTickets")
    public Ticket addNewTicket(@RequestBody Ticket param){
        ticketServiceImpl.createNewTicket(param);
        return param;
    }

    @GetMapping("/getAllTicket")
    public List<TicketDto> getAllTicket(){
        return ticketServiceImpl.getAllTicket();
    }

}
