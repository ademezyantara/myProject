package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.dto.TicketDto;
import com.example.myproject.miniproject.entities.Ticket;
import com.example.myproject.miniproject.repositories.TicketRepository;
import com.example.myproject.miniproject.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket createNewTicket(Ticket request) {
        ticketRepository.save(request);
        return request;
    }

    @Override
    public List<TicketDto> getAllTicket() {
        List<Ticket> tickets =  ticketRepository.findAllSortedByNameUsingNative();
        return tickets
                .stream()
                .map(
                        thisTickets ->
                                TicketDto
                                        .builder()
                                        .ticketId(thisTickets.getTicketId())
                                        .price(thisTickets.getPrice())
                                        .stock(thisTickets.getStock())
                                        .title(thisTickets.getTitle())
                                        .description(thisTickets.getDescription())
                                        .build()

                )
                .collect(Collectors.toList());
    }

}
