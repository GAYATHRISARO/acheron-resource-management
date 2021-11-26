package org.arm.resource.mngt.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Availability {

	@Id
	private int availableId;
	private String availibityType;
	private int availableHours;
	private Timestamp availableStartDate;
	private Timestamp availableEndDate;

	@Enumerated(EnumType.STRING)
	private AvailabilityStatus availableStatus;

	private Timestamp createDate;

	private Timestamp updateDate;

	private int isDeleted;
	

}
