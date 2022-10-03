package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Category creatNewCategory (Category request);

    public List<Category> getAllCategory();

    public Optional<Category> getById(int id);
}
