package com.lynch.task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lynch.project.Project;

@Entity
@Table(name="tasks")
public class Task {

	@Id
	@Column(name="t_id")
	private int tid;
	@Column(name="t_name")
	private String taskName;
	
	@ManyToOne
	private Project project;
	
	public Task() {

	}
	
	
	public Task(int tid, String taskName, int projectId) {
		super();
		this.tid = tid;
		this.taskName = taskName;
		this.project = new Project(projectId, "", "");
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
}
