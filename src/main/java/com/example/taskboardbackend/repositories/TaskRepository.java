package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // учитываем, что параметр может быть null или пустым
    @Query("SELECT p FROM Task p where " +
            "(:title is null or lower(p.title) like lower(concat('%', :title,'%'))) and" +
            "(:completed is null or p.completed=:completed) and " +
            "(:priorityId is null or p.priority.id=:priorityId) and " +
            "(:categoryId is null or p.category.id=:categoryId)"
    )

    // искать по всем переданным параметрам (пустые параметры учитываться не будут)
//    List<Task> findByParams(@Param("title") String title,
//                            @Param("completed") Integer completed,
//                            @Param("priorityId") Long priorityId,
//                            @Param("categoryId") Long categoryId);
    // искать по всем переданным параметрам (пустые параметры учитываться не будут)
    Page<Task> findByParams(@Param("title") String title,
                            @Param("completed") Integer completed,
                            @Param("priorityId") Long priorityId,
                            @Param("categoryId") Long categoryId,
                            Pageable pageable
    );

}
