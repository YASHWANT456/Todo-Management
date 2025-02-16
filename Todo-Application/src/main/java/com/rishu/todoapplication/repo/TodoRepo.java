package com.rishu.todoapplication.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rishu.todoapplication.entity.Todo;

public interface TodoRepo extends JpaRepository<Todo, Integer> {
	
	@Query("select t from Todo t where t.title = ?1")
	List<Todo>getTodoByTitle(String title);

	@Query("select t from Todo t where t.status = ?1")
	List<Todo>getTodoByStatus(String status);
    
	@Query("SELECT t FROM Todo t WHERE DATE(t.addedDate) = DATE(?1)")
	List<Todo> getTodoByAddedDate(Date addedDate);


	@Query("SELECT t FROM Todo t WHERE DATE(t.todoDate) = DATE(?1)")
	List<Todo> getTodoByLastDate(Date date);

	

}
