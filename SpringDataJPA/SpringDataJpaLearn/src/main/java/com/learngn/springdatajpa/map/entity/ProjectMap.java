package com.learngn.springdatajpa.map.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKey;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;

@Entity
public class ProjectMap {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;

	// userId
	private String createdBy;
	// FK -> PK of CloudProviderModel
	private Long cloudProviderId;

	//List of Data pipeline Tools configured already
	
	private String configuration;
	private String tool;

	Map<String, String> datapipeline = new HashMap<String, String>();
	
	public Map<String, String> getDatapipeline() {
		return datapipeline;
	}

	public void setDatapipeline(String configuration, String tool) {
		datapipeline.put(this.configuration, this.tool);
	}
	


	
/*	@Embedded
	private Datapipeline datapipeline;
	
	public Datapipeline getDatapipeline() {
		return datapipeline;
	}

	public void setDatapipeline(Datapipeline datapipeline) {
		this.datapipeline = datapipeline;
	}*/

	private String projectName;
	private String numOfInstances;



	public ProjectMap() {
		super();
	}

	public ProjectMap(Long projectId, String projectName, String createdBy, String numOfInstances, Long cloudProviderId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.createdBy = createdBy;
		this.numOfInstances = numOfInstances;
		this.cloudProviderId = cloudProviderId;
	}

	/* .............Getters and Setters ................. */

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getNumOfInstances() {
		return numOfInstances;
	}

	public void setNumOfInstances(String numOfInstances) {
		this.numOfInstances = numOfInstances;
	}

	public Long getCloudProviderId() {
		return cloudProviderId;
	}

	public void setCloudProviderId(Long cloudProviderId) {
		this.cloudProviderId = cloudProviderId;
	}

	@Override
	public String toString() {
		return "ProjectDopsModel [projectId=" + projectId + ", createdBy=" + createdBy + ", cloudProviderId="
				+ cloudProviderId  + ", projectName=" + projectName + ", numOfInstances="
				+ numOfInstances + "]";
	}

}
