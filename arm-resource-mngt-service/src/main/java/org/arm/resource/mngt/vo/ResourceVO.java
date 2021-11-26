package org.arm.resource.mngt.vo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.arm.resource.mngt.entity.Availability;
import org.arm.resource.mngt.entity.Leaves;
import org.arm.resource.mngt.entity.Project;
import org.arm.resource.mngt.entity.Task;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "resourceId")
public class ResourceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6006685066263382760L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resourceId;
	private String resourceName;
	private String resourceType;
//	private String region;
//	private String projectName;
	private String taskName;
//	private Timestamp taskStartDate;//task
//	private Timestamp taskEndDate;//task
//	private String availibityType;
//	private int availableHours;
//	private Timestamp availableStartDate;
//	private Timestamp availableEndDate;

	@OneToMany(mappedBy = "resource")
	// @JsonBackReference
	private List<Task> taskList;

	@OneToOne
	@JoinColumn(name = "availableId")
	private Availability availability;

	@OneToOne
	@JoinColumn(name = "leave_id")
	private Leaves leave;

	@ManyToOne
	@JoinColumn(name = "project_id")
	private ProjectVO projectVO;

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

//	public String getRegion() {
//		return region;
//	}
//
//	public void setRegion(String region) {
//		this.region = region;
//	}

//	public String getProjectName() {
//		return projectName;
//	}
//
//	public void setProjectName(String projectName) {
//		this.projectName = projectName;
//	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


//
//	public Timestamp getTaskStartDate() {
//		return taskStartDate;
//	}
//
//	public void setTaskStartDate(Timestamp taskStartDate) {
//		this.taskStartDate = taskStartDate;
//	}
//
//	public Timestamp getTaskEndDate() {
//		return taskEndDate;
//	}
//
//	public void setTaskEndDate(Timestamp taskEndDate) {
//		this.taskEndDate = taskEndDate;
//	}
//
//	public String getAvailibityType() {
//		return availibityType;
//	}
//
//	public void setAvailibityType(String availibityType) {
//		this.availibityType = availibityType;
//	}
//
//	public int getAvailableHours() {
//		return availableHours;
//	}
//
//	public void setAvailableHours(int availableHours) {
//		this.availableHours = availableHours;
//	}
//
//	public Timestamp getAvailableStartDate() {
//		return availableStartDate;
//	}
//
//	public void setAvailableStartDate(Timestamp availableStartDate) {
//		this.availableStartDate = availableStartDate;
//	}
//
//	public Timestamp getAvailableEndDate() {
//		return availableEndDate;
//	}
//
//	public void setAvailableEndDate(Timestamp availableEndDate) {
//		this.availableEndDate = availableEndDate;
//	}
//
	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}

	public Leaves getLeave() {
		return leave;
	}

	public void setLeave(Leaves leave) {
		this.leave = leave;
	}
	public ProjectVO getProject() {
		return projectVO;
	}

	public void setProject(ProjectVO projectVO) {
		this.projectVO = projectVO;
	}
}
