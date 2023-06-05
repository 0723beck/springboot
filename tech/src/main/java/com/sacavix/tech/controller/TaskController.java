package com.sacavix.tech.controller;

import com.sacavix.tech.dto.TaskInDTO;
import com.sacavix.tech.persintence.entity.Task;
import com.sacavix.tech.persintence.entity.TaskStatus;
import com.sacavix.tech.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping
    public Task createtask(@RequestBody TaskInDTO data){
    return this.service.createTask(data);
}

    @GetMapping
    public List<Task> findAllTask(){
      return  service.findAll();
    }


    @GetMapping("/status/{status}")
    public  List<Task> findAllByTaskStatus(@PathVariable("status")TaskStatus status){
        return this.service.findAllByTaskStatus(status);
    }


}
