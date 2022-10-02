package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.OrganizerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrganizerRepository extends JpaRepository<OrganizerEntity,Integer> {

    @Query(value = "SELECT * FROM Organizer ORDER BY name", nativeQuery = true)
    public List<OrganizerEntity> findAllSortedByNameUsingNative();

    @Query(value = "SELECT * FROM Organizer WHERE ID= :id  ", nativeQuery = true)
    Optional <OrganizerEntity> findByIdUsingNative(int id);



}
