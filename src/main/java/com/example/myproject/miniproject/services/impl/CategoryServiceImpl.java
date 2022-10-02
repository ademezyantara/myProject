package com.example.myproject.miniproject.services.impl;

import com.example.myproject.miniproject.entities.CategoryEntity;
import com.example.myproject.miniproject.repositories.CategoryRepository;
import com.example.myproject.miniproject.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryEntity creatNewCategory(CategoryEntity request) {
        categoryRepository.save(request);
        return request;
    }

    @Override
    public List<CategoryEntity> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity getById(int id) {
        return categoryRepository.findById(id).get();
    }
}
