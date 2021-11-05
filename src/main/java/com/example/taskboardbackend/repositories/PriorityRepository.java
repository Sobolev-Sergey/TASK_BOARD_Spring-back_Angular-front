package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Category;
import com.example.taskboardbackend.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// описываем основные методы доступа к данным
@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {

    // получить все значения, сортировка по id
    List<Priority> findAllByOrderByIdAsc();

}
