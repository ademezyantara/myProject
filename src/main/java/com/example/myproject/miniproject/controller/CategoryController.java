package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.entities.CategoryEntity;
import com.example.myproject.miniproject.entities.OrganizerEntity;
import com.example.myproject.miniproject.services.CategoryService;
import com.example.myproject.miniproject.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriez")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryServiceImpl;

    @PostMapping("/addNewCategory")
    public CategoryEntity addNewCategory(@RequestBody CategoryEntity param){

        categoryServiceImpl.creatNewCategory(param);
        return param;
    }

    @GetMapping("/getAllCategoriez")
    public List<CategoryEntity> getAllCategory(){
        return categoryServiceImpl.getAllCategory();
    }

    @GetMapping("getById")
    public CategoryEntity getById(@RequestParam int id){
        return categoryServiceImpl.getById(id);
    }
}
