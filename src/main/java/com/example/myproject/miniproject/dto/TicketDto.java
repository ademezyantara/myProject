package com.example.myproject.miniproject.dto;

import com.example.myproject.miniproject.entities.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private int ticketId;
    private String title;
    private String description;
    private Integer price;
    private Integer stock;
}
