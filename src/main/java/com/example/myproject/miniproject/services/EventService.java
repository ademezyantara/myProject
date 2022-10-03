package com.example.myproject.miniproject.services;


import com.example.myproject.miniproject.dto.EventDto;
import com.example.myproject.miniproject.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    Event createNewEvent (Event request);

    public List<EventDto> getAllEvent();

    public Optional<Event> getById(int id);
}
