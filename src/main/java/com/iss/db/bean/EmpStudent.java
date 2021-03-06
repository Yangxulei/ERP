package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

/**
 * EmpStudent generated by hbm2java
 */
public class EmpStudent implements java.io.Serializable {

	private String id;
	private String empId;
	private String school;
	private Integer level;
	private String interest;
	private Integer payType;
	private Long payCount;

	public EmpStudent() {
	}

	public EmpStudent(String id, String empId) {
		this.id = id;
		this.empId = empId;
	}

	public EmpStudent(String id, String empId, String school, Integer level, String interest, Integer payType,
			Long payCount) {
		this.id = id;
		this.empId = empId;
		this.school = school;
		this.level = level;
		this.interest = interest;
		this.payType = payType;
		this.payCount = payCount;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Long getPayCount() {
		return this.payCount;
	}

	public void setPayCount(Long payCount) {
		this.payCount = payCount;
	}

}
