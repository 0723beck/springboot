package com.sacavix.tech.persintence.repository;

import com.sacavix.tech.persintence.entity.Task;
import com.sacavix.tech.persintence.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//esto es para jpa el cual nos va a dejar acceder a las tablas-entity que se definieron

public interface TaskRepository extends JpaRepository <Task,Long> {

   public List<Task> findAllByTaskStatus(TaskStatus status);

   @Query(value = "",nativeQuery = true)
   public void markTaskFiniches(@Param("id") Long id);


}
