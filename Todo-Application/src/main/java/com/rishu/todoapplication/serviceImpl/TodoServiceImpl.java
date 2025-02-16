package com.rishu.todoapplication.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rishu.todoapplication.entity.Todo;
import com.rishu.todoapplication.exception.ResourceNotFoundException;
import com.rishu.todoapplication.repo.TodoRepo;
import com.rishu.todoapplication.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService
{

	@Autowired
	TodoRepo todoRepo;
	@Override
	public Todo addTodo(Todo todo) {
		// TODO Auto-generated method stub
		Todo addedTodo = new Todo();
		addedTodo.setTitle(todo.getTitle());
		addedTodo.setContent(todo.getContent());
		Date newDate = new Date();
		addedTodo.setAddedDate(newDate);
		addedTodo.setTodoDate(todo.getTodoDate());
		addedTodo.setStatus(todo.getStatus());
		todoRepo.save(addedTodo);
		return addedTodo;
		
	}

	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		List<Todo>todos = todoRepo.findAll();
		if(todos.size() == 0)
		{
			throw new ResourceNotFoundException("Resource Not Found ",HttpStatus.NOT_FOUND);
		}
		return todos;
	}
	@Override
	public void deleteTodo(Integer id) {
		// TODO Auto-generated method stub
		Todo todo = todoRepo.findById(id).orElse(null);
		if(todo == null)
		{
			throw new ResourceNotFoundException("Resource Not Found with given Id ",HttpStatus.NOT_FOUND);
		}
		
		todoRepo.delete(todo);
		
		
	}

	@Override
	public Todo getTodo(Integer id) {
		// TODO Auto-generated method stub
		Todo todo = todoRepo.findById(id).orElse(null);
		if(todo == null)
		{
			throw new ResourceNotFoundException("Resource Not Found with given Id ",HttpStatus.NOT_FOUND);
		}
		return todo;
		
	
	}

	@Override
	public Todo updateTodo(Todo todo, Integer id) {
		// TODO Auto-generated method stub
		Todo updatedTodo = todoRepo.findById(id).orElse(null);
		if(updatedTodo == null)
		{
			throw new ResourceNotFoundException("Resource Not Found with given Id ",HttpStatus.NOT_FOUND);
		}
		updatedTodo.setTitle(todo.getTitle());
		updatedTodo.setContent(todo.getContent());
		Date newDate = new Date();
		updatedTodo.setAddedDate(newDate);
		updatedTodo.setTodoDate(todo.getTodoDate());
		updatedTodo.setStatus(todo.getStatus());
		todoRepo.save(updatedTodo);
		return updatedTodo;
	}

	public List<Todo> getTodoByTitle(String title) {
		// TODO Auto-generated method stub
		
		List<Todo>todos = todoRepo.getTodoByTitle(title);
		if(todos.size() == 0)
		{
			throw new ResourceNotFoundException("Resource Not Found ",HttpStatus.NOT_FOUND);
		}
		return todos;
	}

	public List<Todo> getTodoByStatus(String status) {
		// TODO Auto-generated method stub
		List<Todo>todos = todoRepo.getTodoByStatus(status);
		if(todos.size() == 0)
		{
			throw new ResourceNotFoundException("Resource Not Found ",HttpStatus.NOT_FOUND);
		}
		return todos;
		
	}

	public List<Todo> getTodoByAddedDate(Date addedDate) {
		List<Todo>todos = todoRepo.getTodoByAddedDate(addedDate);
		if(todos.size() == 0)
		{
			throw new ResourceNotFoundException("Resource Not Found ",HttpStatus.NOT_FOUND);
		}
		return todos;
	}

	public List<Todo> getTodoByLastDate(Date lastDate) {
		List<Todo>todos = todoRepo.getTodoByLastDate(lastDate);
		if(todos.size() == 0)
		{
			throw new ResourceNotFoundException("Resource Not Found ",HttpStatus.NOT_FOUND);
		}
		return todos;
		
	}
	

}
