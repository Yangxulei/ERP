package com.iss.db.bean;
// Generated 2017-2-21 11:35:18 by Hibernate Tools 4.3.5.Final

import java.util.List;
import java.util.Set;

/**
 * Job generated by hbm2java
 */
public class Job implements java.io.Serializable {

	private Integer id;
	private String jobTitle;
	public Integer reportTo;
	private String desc;
	private Byte enable;
	private Set<Job> children;

	public Job() {
	}

	public Job(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Job(String jobTitle, Integer reportTo, String desc, Byte enable) {
		this.jobTitle = jobTitle;
		this.reportTo = reportTo;
		this.desc = desc;
		this.enable = enable;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getReportTo() {
		return this.reportTo;
	}

	public void setReportTo(Integer reportTo) {
		this.reportTo = reportTo;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Byte getEnable() {
		return this.enable;
	}

	public void setEnable(Byte enable) {
		this.enable = enable;
	}


	public String getText(){
		return this.jobTitle;
	}

	public Integer getParentId() {
		return this.reportTo;
	}

	public Set<Job> getChildren() {
		return children;
	}

	public void setChildren(Set<Job> children) {
		this.children = children;
	}
}