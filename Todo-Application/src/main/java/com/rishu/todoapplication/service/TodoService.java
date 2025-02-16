package com.rishu.todoapplication.service;

import java.util.Date;
import java.util.List;

import com.rishu.todoapplication.entity.Todo;

public interface TodoService {
	
	public Todo addTodo(Todo todo);
	public List<Todo>getAllTodo();
	public Todo getTodo(Integer id);
	public Todo updateTodo(Todo todo,Integer id);
	public void deleteTodo(Integer id);
	public List<Todo> getTodoByTitle(String title);
	public List<Todo> getTodoByAddedDate(Date addedDate);
	public List<Todo> getTodoByStatus(String status);
	public List<Todo> getTodoByLastDate(Date lastDate);

}
