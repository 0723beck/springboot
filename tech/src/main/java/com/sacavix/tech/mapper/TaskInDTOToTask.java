package com.sacavix.tech.mapper;

import com.sacavix.tech.dto.TaskInDTO;
import com.sacavix.tech.persintence.entity.Task;
import com.sacavix.tech.persintence.entity.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask implements  IMapper<TaskInDTO, Task>{
    @Override
    public Task map(TaskInDTO in) {
        Task task= new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
         task.setCreatedDate(LocalDateTime.now());
         task.setTaskStatus(TaskStatus.ON_TIME);
         task.setFinished(false);
         return  task;
    }
}
