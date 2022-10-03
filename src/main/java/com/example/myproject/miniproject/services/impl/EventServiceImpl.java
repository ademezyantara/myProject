package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.dto.EventDto;
import com.example.myproject.miniproject.entities.Event;
import com.example.myproject.miniproject.repositories.EventRepository;
import com.example.myproject.miniproject.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event createNewEvent(Event request) {
        eventRepository.save(request);
        return request;
    }

    @Override
    public List<EventDto> getAllEvent() {
        List<Event> events = eventRepository.findAllSortedByNameUsingNative();
        return events
                .stream()
                .map(
                        thisEvents ->
                                EventDto
                                        .builder()
                                        .name(thisEvents.getName())
                                        .bannerImage(thisEvents.getBannerImage())
                                        .topics(thisEvents.getTopics())
                                        .organizer(thisEvents.getOrganizer())
                                        .category(thisEvents.getCategory())
                                        .build()
                )
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Event> getById(int id) {
        return eventRepository.findByIdUsingNative(id);
    }
}
