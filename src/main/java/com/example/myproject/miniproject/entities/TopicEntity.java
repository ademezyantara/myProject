package com.example.myproject.miniproject.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "topic")
public class TopicEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "sytem-uuid",strategy = "uuid")
    @Column(name = "topic_id")
    private String topicId;

    @Column(nullable = false ,unique = true)
    private String name;
}
