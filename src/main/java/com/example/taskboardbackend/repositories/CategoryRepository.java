package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// описываем основные методы доступа к данным
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // если title == null или =='', то получим все значения
    @Query("SELECT c FROM Category c where " +
            "(:title is null or :title='' or lower(c.title) like lower(concat('%', :title,'%')))  " +
            "order by c.title asc")
    List<Category> findByTitle(@Param("title") String title);

    // получить все значения, сортировка по названию
    List<Category> findAllByOrderByTitleAsc();

}
