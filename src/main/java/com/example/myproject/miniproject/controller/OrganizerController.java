package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.services.impl.OrganizerServiceImpl;
import com.example.myproject.miniproject.entities.OrganizerEntity;
import com.example.myproject.miniproject.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organizers")
public class OrganizerController {

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    OrganizerServiceImpl organizerServiceImpl;

    @GetMapping("/checkAPI")
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping("/addNewOrganizer")
    public OrganizerEntity addNewOrganizer(@RequestBody OrganizerEntity param){


        organizerServiceImpl.createOrganizer(param);
        return param;
    }

    @GetMapping("/getAllOrganizer")
    public List<OrganizerEntity> getAllOrganizer(){
        return organizerServiceImpl.getAllOrganizer();
    }

    @GetMapping("getById")
    public Optional<OrganizerEntity> getById(@RequestParam int id){
        return organizerServiceImpl.getById(id);
    }
}
