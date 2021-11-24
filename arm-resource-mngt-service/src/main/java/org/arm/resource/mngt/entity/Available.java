package org.arm.resource.mngt.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Available {

	@Id
	private int id;

	private Timestamp startDate;
	private Timestamp endDate;
	private float customhours;
	private int leaveCount;
	private AvailabilityStatus availableStatus;
	
	private Timestamp createDate;
	
	private Timestamp updateDate;
	
	private int isDeleted;
	@ManyToOne
	@JoinColumn(name="resourceId")
	private Resource resource;
}
