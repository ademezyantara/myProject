package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.dto.EventDto;
import com.example.myproject.miniproject.entities.Event;
import com.example.myproject.miniproject.services.impl.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    EventServiceImpl eventServiceImpl;

    @PostMapping("/addNewEvents")
    public Event addNewEvent(@RequestBody Event param){
        eventServiceImpl.createNewEvent(param);
        return param;
    }

    @GetMapping("/getAllEvent")
    public List<EventDto> getAllEvent(){
        return eventServiceImpl.getAllEvent();
    }

    @GetMapping("getById")
    public Optional<Event> getById(@RequestParam int id){
        return eventServiceImpl.getById(id);
    }
}
