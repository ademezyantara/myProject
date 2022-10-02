package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.entities.TopicEntity;

import java.util.List;

public interface TopicService {

    TopicEntity createNewTopic(TopicEntity request);

    public List<TopicEntity> getAllTopic();

    public TopicEntity getById(int id);
}
