package com.lynch.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	public Optional<Task> getTask(int tid) {
		return taskRepository.findById(tid);
	}
	
	public void addTask(Task task) {
		taskRepository.save(task);
	}

	public void editTask(Task task ) {
		taskRepository.save(task);
	}	
	
	public void deleteTask(int tid) {
		taskRepository.deleteById(tid);
	}
	
	public List<Task> findByProjectId(int id){
		List<Task> tasks = new ArrayList<>();
		taskRepository.findByProjectId(id)
		.forEach(tasks::add);
		return tasks;
	}
		
}
