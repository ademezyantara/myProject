package com.example.myproject.miniproject.repositories;

import com.example.myproject.miniproject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT * FROM Category ORDER BY name", nativeQuery = true)
    public List<Category> findAllSortedByNameUsingNative();

    @Query(value = "SELECT * FROM Category WHERE category_id= :id  ", nativeQuery = true)
    Optional<Category> findByIdUsingNative(int id);
}
