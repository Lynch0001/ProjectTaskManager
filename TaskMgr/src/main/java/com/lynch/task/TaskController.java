package com.lynch.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lynch.project.Project;
import com.lynch.task.Task;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@RequestMapping("/projects/{id}/tasks")
	public List<Task> getAll(@PathVariable int id){
		return taskService.findByProjectId(id);
	}
	
	@RequestMapping("/projects/{id}/tasks/{tid}")
	public Optional<Task> getTask(@PathVariable int tid){
		return taskService.getTask(tid);
	}
	
	@RequestMapping(value="/projects/{id}/tasks", method=RequestMethod.POST)
	public void addTask(@PathVariable int id, @RequestBody Task task) {
		task.setProject(new Project(id, "", ""));
		taskService.addTask(task);
	}

	
	@RequestMapping(value="/projects/{id}/tasks/{tid}", method=RequestMethod.PUT)
	public void editTask(@PathVariable int id, @RequestBody Task task) {
		task.setProject(new Project(id, "", ""));
		taskService.editTask(task);
	}
	
	@RequestMapping(value="/projects/{id}/tasks/{tid}", method=RequestMethod.DELETE)
	public void deleteTask(@PathVariable int tid) {
		taskService.deleteTask(tid);
	}
	
}
