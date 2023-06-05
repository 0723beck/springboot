package com.sacavix.tech.persintence.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

//esto es de lombok que genera los get and set
@Data
//esto es de hibernate lo tenemos que marcar como una entidad
@Entity
@Table(name = "task")
public class Task {
    //esto es obligado por hibernate
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime eta;
    private boolean finished;
    private TaskStatus taskStatus;



}
