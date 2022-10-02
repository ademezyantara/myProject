package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.entities.OrganizerEntity;
import com.example.myproject.miniproject.entities.TopicEntity;
import com.example.myproject.miniproject.repositories.OrganizerRepository;
import com.example.myproject.miniproject.services.impl.OrganizerServiceImpl;
import com.example.myproject.miniproject.services.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topics")
public class TopicController {

    @Autowired
    TopicServiceImpl topicServiceImpl;

    @GetMapping("/checkAPI")
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping("/addNewTopic")
    public TopicEntity addNewTopic(@RequestBody TopicEntity param){
        topicServiceImpl.createNewTopic(param);
        return param;
    }

    @GetMapping("/getAllTopic")
    public List<TopicEntity> getAllTopic(){
        return topicServiceImpl.getAllTopic();
    }

    @GetMapping("getById")
    public TopicEntity getById(@RequestParam int id){
        return topicServiceImpl.getById(id);
    }
}
