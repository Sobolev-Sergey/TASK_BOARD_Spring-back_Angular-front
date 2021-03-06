package com.example.taskboardbackend.repositories;

import com.example.taskboardbackend.entity.Stat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends CrudRepository<Stat, Long> {

}
