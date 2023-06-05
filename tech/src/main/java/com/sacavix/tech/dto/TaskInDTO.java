package com.sacavix.tech.dto;

import com.sacavix.tech.persintence.entity.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {

    private String title;
    private String description;
    private LocalDateTime eta;






}
