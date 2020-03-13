package com.lynch.project;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	@Id
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_desc")
	private String desc;
	@Column(name="p_plan_start", nullable=true)
	private Date plannedStartDate;
	@Column(name="p_plan_end", nullable=true)
	private Date plannedEndDate;
	@Column(name="p_actual_start", nullable=true)
	private Date actualStartDate;
	@Column(name="p_actual_end", nullable=true)
	private Date actualEndDate;
	
	
	public Project() {
	}
	
	public Project(int id, String name, String desc) {
		super();
		this.id=id;
		this.name=name;
		this.desc=desc;		
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getPlannedStartDate() {
		return plannedStartDate;
	}
	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}
	public Date getPlannedEndDate() {
		return plannedEndDate;
	}
	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}
	public Date getActualStartDate() {
		return actualStartDate;
	}
	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	public Date getActualEndDate() {
		return actualEndDate;
	}
	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
}
