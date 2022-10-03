package com.example.myproject.miniproject.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "topic")
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "topic_id")
    private int topicId;

    @Column(nullable = false ,unique = true)
    private String name;

    public Topics() {
    }

    public Topics(int topicId, String name) {
        this.topicId = topicId;
        this.name = name;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TopicEntity{" +
                "topicId='" + topicId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
