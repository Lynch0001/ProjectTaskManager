package com.lynch.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProjectController {

		@Autowired
		private ProjectService projectService;

		@RequestMapping("/projects")
		public List<Project> getAll(){
			return projectService.getAllProjects();
		}
		
		@RequestMapping("/projects/{id}")
		public Optional<Project> getProject(@PathVariable int id){
			return projectService.getProject(id);
		}
		
		@RequestMapping(value="/projects", method=RequestMethod.POST)
		public void addProject(@RequestBody Project project) {
			projectService.addProject(project);
		}
		
		@RequestMapping(value="/projects", method=RequestMethod.PUT)
		public void editProject(@RequestBody Project project) {
			projectService.editProject(project);
		}
		
		@RequestMapping(value="/projects/{id}", method=RequestMethod.DELETE)
		public void deleteProject(@PathVariable int id) {
			projectService.deleteProject(id);
		}
		
}
