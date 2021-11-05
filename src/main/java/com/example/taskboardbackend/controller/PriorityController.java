package com.example.taskboardbackend.controller;

import com.example.taskboardbackend.entity.Priority;
import com.example.taskboardbackend.repositories.PriorityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// используем @RestController вместо обычного @Controller, чтобы все ответы сразу оборачивались в JSON
// иначе пришлось бы выполнять лишнюю работу, использовать @ResponseBody для ответа, указывать тип отправки JSON
@RestController
@RequestMapping("/priority")
public class PriorityController {

    // доступ к данным из БД
    private PriorityRepository priorityRepository;

    // автоматическое внедрение экземпляра класса через конструктор
    // не используем @Autowired для переменной класса, т.к. "Field injection is not recommended "
    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    // for testing GET http://localhost:8080/priority/test
    @GetMapping("/test")
    public List<Priority> test() {
        List<Priority> list = priorityRepository.findAll();
        System.out.println("list= " + list);

        return list; // JSON формат будет использоваться автоматически
    }
}
