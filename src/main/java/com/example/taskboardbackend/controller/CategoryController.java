package com.example.taskboardbackend.controller;

import com.example.taskboardbackend.entity.Category;
import com.example.taskboardbackend.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

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

    /**
     *
     // сохранить в БД новый объект
    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        categoryRepository.save(category);
    }
    */

    // вернуть созданный/добавленный объект
    @PostMapping("/add")
    public Category add(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

}
