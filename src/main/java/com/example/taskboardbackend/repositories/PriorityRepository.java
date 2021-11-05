package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// описываем основные методы доступа к данным
@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {

}
