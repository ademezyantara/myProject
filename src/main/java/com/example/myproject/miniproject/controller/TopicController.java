package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.entities.Topics;
import com.example.myproject.miniproject.services.impl.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Topics addNewTopic(@RequestBody Topics param){
        topicServiceImpl.createNewTopic(param);
        return param;
    }

    @GetMapping("/getAllTopic")
    public List<Topics> getAllTopic(){
        return topicServiceImpl.getAllTopic();
    }

    @GetMapping("getById")
    public Optional<Topics> getById(@RequestParam int id){
        return topicServiceImpl.getById(id);
    }
}
