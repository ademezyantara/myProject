package com.example.myproject.miniproject.services;

import com.example.myproject.miniproject.entities.CategoryEntity;

import java.util.List;

public interface CategoryService {

    CategoryEntity creatNewCategory (CategoryEntity request);

    public List<CategoryEntity> getAllCategory();

    public CategoryEntity getById(int id);
}
