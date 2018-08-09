package com.learngn.springdatajpa.map.entity;

import javax.persistence.Embeddable;


public class Datapipeline {
	
	private String configuration;
	private String tool;
	
	public Datapipeline() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Datapipeline(String configuration, String tool) {
		super();
		this.configuration = configuration;
		this.tool = tool;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
}
