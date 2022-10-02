package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.entities.TopicEntity;
import com.example.myproject.miniproject.repositories.TopicRepository;
import com.example.myproject.miniproject.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    TopicRepository topicRepository;

    @Override
    public TopicEntity createNewTopic(TopicEntity request) {
        topicRepository.save(request);
        return request;
    }

    @Override
    public List<TopicEntity> getAllTopic() {
        return topicRepository.findAll();
    }

    @Override
    public TopicEntity getById(int id) {
        return topicRepository.findById(id).get();
    }
}
