package com.example.taskboardbackend.controller;

import com.example.taskboardbackend.entity.Category;
import com.example.taskboardbackend.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/test")
    public List<Category> test() {
        List<Category> list = categoryRepository.findAll();
        System.out.println("list= " + list);

        return list;
    }
}
