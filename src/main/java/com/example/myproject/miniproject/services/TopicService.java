package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.entities.Topics;

import java.util.List;
import java.util.Optional;

public interface TopicService {

    Topics createNewTopic(Topics request);

    public List<Topics> getAllTopic();

    public Optional<Topics> getById(int id);
}
