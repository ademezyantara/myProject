package com.example.myproject.miniproject.controller;

import com.example.myproject.miniproject.entities.Category;
import com.example.myproject.miniproject.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoriez")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryServiceImpl;

    @PostMapping("/addNewCategory")
    public Category addNewCategory(@RequestBody Category param){

        categoryServiceImpl.creatNewCategory(param);
        return param;
    }

    @GetMapping("/getAllCategory")
    public List<Category> getAllCategory(){
        return categoryServiceImpl.getAllCategory();
    }

    @GetMapping("getById")
    public Optional<Category> getById(@RequestParam int id){
        return categoryServiceImpl.getById(id);
    }
}
