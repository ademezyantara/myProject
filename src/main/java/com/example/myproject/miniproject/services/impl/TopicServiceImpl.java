package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.entities.Topics;
import com.example.myproject.miniproject.repositories.TopicRepository;
import com.example.myproject.miniproject.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicRepository topicRepository;

    @Override
    public Topics createNewTopic(Topics request) {
        topicRepository.save(request);
        return request;
    }

    @Override
    public List<Topics> getAllTopic() {
        return topicRepository.findAllSortedByNameUsingNative();
    }

    @Override
    public Optional <Topics> getById(int id) {
        return topicRepository.findByIdUsingNative(id);
    }
}
