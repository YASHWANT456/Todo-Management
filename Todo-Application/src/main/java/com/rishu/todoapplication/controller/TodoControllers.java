package com.rishu.todoapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishu.todoapplication.entity.Todo;
import com.rishu.todoapplication.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoControllers 
{
	@Autowired
	TodoService todoService;
	
	@PostMapping("/create")
	public ResponseEntity<Todo>createTodo(@RequestBody Todo todo)
	{
		return todoService.createTodo(todo);
	}
	@GetMapping("/getAllTodo")
	public ResponseEntity<List<Todo>>getAllTodos()
	{
		return todoService.getAllTodos();
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Todo>getTodoById(@PathVariable Integer id)
	{
		return todoService.getTodoById(id);
	}
	@PutMapping("update/{id}")
	public ResponseEntity<Todo>updateTodo(@RequestBody Todo todo , @PathVariable Integer id)
	{
		return todoService.updateTodo(todo,id);
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String>deleteTodo(@PathVariable Integer id)
	{
		return todoService.deleteTodo(id);
	}

}
