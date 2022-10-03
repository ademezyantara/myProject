package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer,Integer> {

    @Query(value = "SELECT * FROM Organizer ORDER BY name", nativeQuery = true)
    public List<Organizer> findAllSortedByNameUsingNative();

    @Query(value = "SELECT * FROM Organizer WHERE ID= :id  ", nativeQuery = true)
    Optional <Organizer> findByIdUsingNative(int id);



}
