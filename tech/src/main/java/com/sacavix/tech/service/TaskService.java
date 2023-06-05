package com.sacavix.tech.service;

import com.sacavix.tech.dto.TaskInDTO;
import com.sacavix.tech.mapper.TaskInDTOToTask;
import com.sacavix.tech.persintence.entity.Task;
import com.sacavix.tech.persintence.entity.TaskStatus;
import com.sacavix.tech.persintence.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    //esto es por la injecion de dependencia para poder utilizar el repository sin tener que crear una instancia
    @Autowired
    private final TaskRepository repository;
    @Autowired
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO data) {
        Task task= mapper.map(data);
        return this.repository.save(task);
    }

    public List<Task> findAll(){
        return this.repository.findAll();
    }

    public List<Task> findAllByTaskStatus(TaskStatus status){
       return this.repository.findAllByTaskStatus(status);
    }

}
