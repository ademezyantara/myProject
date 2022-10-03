package com.example.myproject.miniproject.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "event_id",nullable = false)
    private int eventId;

    @ManyToOne
    @JoinColumn(name="organizer_id")
    private Organizer organizer;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String bannerImage;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="topic_id")
    private Topics topics;

    public Event() {
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public Event(int eventId, Organizer organizer, String name, String bannerImage, Category category, Topics topics) {
        this.eventId = eventId;
        this.organizer = organizer;
        this.name = name;
        this.bannerImage = bannerImage;
        this.category = category;
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", organizer=" + organizer +
                ", name='" + name + '\'' +
                ", bannerImage='" + bannerImage + '\'' +
                ", category=" + category +
                ", topics=" + topics +
                '}';
    }
}
