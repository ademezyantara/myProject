package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Integer> {

    @Query(value = "SELECT * FROM Event ORDER BY name", nativeQuery = true)
    public List<Event> findAllSortedByNameUsingNative();

    @Query(value = "SELECT * FROM Event WHERE event_id= :id  ", nativeQuery = true)
    Optional<Event> findByIdUsingNative(int id);
}
