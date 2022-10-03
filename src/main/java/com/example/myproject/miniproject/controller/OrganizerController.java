package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.dto.OrganizerDto;
import com.example.myproject.miniproject.services.impl.OrganizerServiceImpl;
import com.example.myproject.miniproject.entities.Organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    @Autowired
    OrganizerServiceImpl organizerServiceImpl;

    @GetMapping("/checkAPI")
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping("/addNewOrganizer")
    public Organizer addNewOrganizer(@RequestBody Organizer param){


        organizerServiceImpl.createOrganizer(param);
        return param;
    }

    @GetMapping("/getAllOrganizer")
    public List<OrganizerDto> getAllOrganizer(){
        return organizerServiceImpl.getAllOrganizer();
    }

    @GetMapping("getById")
    public Optional<Organizer> getById(@RequestParam int id){
        return organizerServiceImpl.getById(id);
    }
}
