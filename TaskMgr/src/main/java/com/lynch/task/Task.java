package com.lynch.task;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lynch.project.Project;

@Entity
@Table(name="tasks")
public class Task {

	@Id
	@Column(name="t_id")
	private int tid;
	@Column(name="t_name")
	private String taskName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="t_added_date", nullable=true)
	private Date tAddedDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="t_due_date", nullable=true)
	private Date tDueDate;
	@Column(name="t_started")	
	private Boolean tIsStarted;
	@Column(name="t_complete")	
	private Boolean tIsComplete;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="t_complete_date", nullable=true)
	private Date tCompleteDate;
	
	
	@ManyToOne
	private Project project;
	
	public Task() {

	}
	
	
	public Task(int tid, String taskName, int projectId, Date tAddedDate, Date tCompleteDate) {
		super();
		this.tid = tid;
		this.taskName = taskName;
		this.project = new Project(projectId, "", "");
		this.tAddedDate = tAddedDate;
		this.tCompleteDate = tCompleteDate;
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


	public Date gettDueDate() {
		return tDueDate;
	}


	public void settDueDate(Date tDueDate) {
		this.tDueDate = tDueDate;
	}


	public Boolean gettIsStarted() {
		return tIsStarted;
	}


	public void settIsStarted(Boolean tIsStarted) {
		this.tIsStarted = tIsStarted;
	}


	public Boolean gettIsComplete() {
		return tIsComplete;
	}


	public void settIsComplete(Boolean tIsComplete) {
		this.tIsComplete = tIsComplete;
	}


	public Date gettAddedDate() {
		return tAddedDate;
	}


	public void settAddedDate(Date tAddedDate) {
		this.tAddedDate = tAddedDate;
	}


	public Date gettCompleteDate() {
		return tCompleteDate;
	}


	public void settCompleteDate(Date tCompleteDate) {
		this.tCompleteDate = tCompleteDate;
	}
	
	
}
