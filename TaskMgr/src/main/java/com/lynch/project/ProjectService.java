package com.lynch.project;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

		@Autowired
		private ProjectRepository projectRepository;

		public List<Project> getAllProjects(){
			return projectRepository.findAll();
		}
		
		public Optional<Project> getProject(int id) {
			return projectRepository.findById(id);
		}
		
		public void addProject(Project project) {
			projectRepository.save(project);
		}
		
		public void editProject(Project project ) {
			projectRepository.save(project);
		}	
		
		public void deleteProject(int id) {
			projectRepository.deleteById(id);
		}	
		
	}

