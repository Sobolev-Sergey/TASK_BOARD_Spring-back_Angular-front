package com.example.taskboardbackend.controller;

import com.example.taskboardbackend.entity.Stat;
import com.example.taskboardbackend.repositories.StatRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatController {

    private final StatRepository statRepository;

    public StatController(StatRepository statRepository) {
        this.statRepository = statRepository;
    }

    private final Long defaultId = 1l;

    @GetMapping("/stat")
    public ResponseEntity<Stat> findById() {
        return ResponseEntity.ok(statRepository.findById(defaultId).get());
    }

}
