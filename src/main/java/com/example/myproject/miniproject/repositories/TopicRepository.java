package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topics, Integer> {

    @Query(value = "SELECT * FROM Topic ORDER BY name", nativeQuery = true)
    public List<Topics> findAllSortedByNameUsingNative();

    @Query(value = "SELECT * FROM Topic WHERE topic_id= :id  ", nativeQuery = true)
    Optional<Topics> findByIdUsingNative(int id);
}
