package com.lynch.project;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="p_plan_start", nullable=true)
	private Date plannedStartDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="p_plan_end", nullable=true)
	private Date plannedEndDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="p_actual_start", nullable=true)
	private Date actualStartDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="p_actual_end", nullable=true)
	private Date actualEndDate;
	
	@Column(name="p_started")	
	private Boolean isStarted;
	@Column(name="p_complete")
	private Boolean isComplete;
	@Column(name="p_ex_handing")
	private Boolean incExHandling;
	@Column(name="p_logging")
	private Boolean incLogging;
	@Column(name="p_auth_auth")
	private Boolean incAuthAuth;
	@Column(name="p_stack_front", nullable=true)
	private String stackFront;
	@Column(name="p_stack_back", nullable=true)
	private String stackBack;
	@Column(name="p_stackbd", nullable=true)
	private String stackDB;
	@Column(name="p_ext_data_source")
	private String extDataSource;
	@Column(name="p_ext_data_source_link", nullable=true)
	private String extDataSourceLink;
	@Column(name="p_use1", nullable=true)
	private String useCase1;
	@Column(name="p_use2", nullable=true)
	private String useCase2;
	@Column(name="p_use3", nullable=true)
	private String useCase3;
	@Column(name="p_use4", nullable=true)
	private String useCase4;
	@Column(name="p_use5", nullable=true)
	private String useCase5;
	@Column(name="p_use6", nullable=true)
	private String useCase6;
	@Column(name="p_use7", nullable=true)
	private String useCase7;
	@Column(name="p_use8", nullable=true)
	private String useCase8;
	@Column(name="p_use9", nullable=true)
	private String useCase9;
	@Column(name="p_use10", nullable=true)
	private String useCase10;

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

	public Boolean getIsStarted() {
		return isStarted;
	}

	public void setIsStarted(Boolean isStarted) {
		this.isStarted = isStarted;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}

	public Boolean getIncExHandling() {
		return incExHandling;
	}

	public void setIncExHandling(Boolean incExHandling) {
		this.incExHandling = incExHandling;
	}

	public Boolean getIncLogging() {
		return incLogging;
	}

	public void setIncLogging(Boolean incLogging) {
		this.incLogging = incLogging;
	}

	public Boolean getIncAuthAuth() {
		return incAuthAuth;
	}

	public void setIncAuthAuth(Boolean incAuthAuth) {
		this.incAuthAuth = incAuthAuth;
	}

	public String getStackFront() {
		return stackFront;
	}

	public void setStackFront(String stackFront) {
		this.stackFront = stackFront;
	}

	public String getStackBack() {
		return stackBack;
	}

	public void setStackBack(String stackBack) {
		this.stackBack = stackBack;
	}

	public String getStackDB() {
		return stackDB;
	}

	public void setStackDB(String stackDB) {
		this.stackDB = stackDB;
	}

	public String getExtDataSource() {
		return extDataSource;
	}

	public void setExtDataSource(String extDataSource) {
		this.extDataSource = extDataSource;
	}

	public String getExtDataSourceLink() {
		return extDataSourceLink;
	}

	public void setExtDataSourceLink(String extDataSourceLink) {
		this.extDataSourceLink = extDataSourceLink;
	}

	public String getUseCase1() {
		return useCase1;
	}

	public void setUseCase1(String useCase1) {
		this.useCase1 = useCase1;
	}

	public String getUseCase2() {
		return useCase2;
	}

	public void setUseCase2(String useCase2) {
		this.useCase2 = useCase2;
	}

	public String getUseCase3() {
		return useCase3;
	}

	public void setUseCase3(String useCase3) {
		this.useCase3 = useCase3;
	}

	public String getUseCase4() {
		return useCase4;
	}

	public void setUseCase4(String useCase4) {
		this.useCase4 = useCase4;
	}

	public String getUseCase5() {
		return useCase5;
	}

	public void setUseCase5(String useCase5) {
		this.useCase5 = useCase5;
	}

	public String getUseCase6() {
		return useCase6;
	}

	public void setUseCase6(String useCase6) {
		this.useCase6 = useCase6;
	}

	public String getUseCase7() {
		return useCase7;
	}

	public void setUseCase7(String useCase7) {
		this.useCase7 = useCase7;
	}

	public String getUseCase8() {
		return useCase8;
	}

	public void setUseCase8(String useCase8) {
		this.useCase8 = useCase8;
	}

	public String getUseCase9() {
		return useCase9;
	}

	public void setUseCase9(String useCase9) {
		this.useCase9 = useCase9;
	}

	public String getUseCase10() {
		return useCase10;
	}

	public void setUseCase10(String useCase10) {
		this.useCase10 = useCase10;
	}
}
