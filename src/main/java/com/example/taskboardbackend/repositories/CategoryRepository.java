package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// описываем основные методы доступа к данным
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // получить все значения, сортировка по названию
    List<Category> findAllByOrderByTitleAsc();

}
