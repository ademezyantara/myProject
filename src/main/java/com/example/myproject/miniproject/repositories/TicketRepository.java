package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value = "SELECT * FROM Ticket ", nativeQuery = true)
    public List<Ticket> findAllSortedByNameUsingNative();
}
