package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * EmpOuter generated by hbm2java
 */
public class EmpOuter implements java.io.Serializable {

	private String id;
	private String empId;
	private String sendCor;
	private Date sendBegin;
	private String sendContract;
	private BigDecimal cycle;
	private Boolean subsidy;

	public EmpOuter() {
	}

	public EmpOuter(String id, String empId, BigDecimal cycle) {
		this.id = id;
		this.empId = empId;
		this.cycle = cycle;
	}

	public EmpOuter(String id, String empId, String sendCor, Date sendBegin, String sendContract, BigDecimal cycle,
			Boolean subsidy) {
		this.id = id;
		this.empId = empId;
		this.sendCor = sendCor;
		this.sendBegin = sendBegin;
		this.sendContract = sendContract;
		this.cycle = cycle;
		this.subsidy = subsidy;
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

	public String getSendCor() {
		return this.sendCor;
	}

	public void setSendCor(String sendCor) {
		this.sendCor = sendCor;
	}

	public Date getSendBegin() {
		return this.sendBegin;
	}

	public void setSendBegin(Date sendBegin) {
		this.sendBegin = sendBegin;
	}

	public String getSendContract() {
		return this.sendContract;
	}

	public void setSendContract(String sendContract) {
		this.sendContract = sendContract;
	}

	public BigDecimal getCycle() {
		return this.cycle;
	}

	public void setCycle(BigDecimal cycle) {
		this.cycle = cycle;
	}

	public Boolean getSubsidy() {
		return this.subsidy;
	}

	public void setSubsidy(Boolean subsidy) {
		this.subsidy = subsidy;
	}

}
