package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.entities.Category;
import com.example.myproject.miniproject.repositories.CategoryRepository;
import com.example.myproject.miniproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category creatNewCategory(Category request) {
        categoryRepository.save(request);
        return request;
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAllSortedByNameUsingNative();
    }

    @Override
    public Optional<Category> getById(int id) {
        return categoryRepository.findByIdUsingNative(id);
    }
}
