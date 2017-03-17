package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * NormalemployeeviewId generated by hbm2java
 */
public class NormalemployeeviewId implements java.io.Serializable {

	private String id;
	private String empNo;
	private String nameCn;
	private String sex;
	private String birth;
	private String personId;
	private String tel;
	private String qq;
	private String email;
	private String country;
	private int state;
	private long deptId;
	private long jobId;
	private String nid;
	private Date joinDate;
	private String eduHistory;
	private String bank;

	public NormalemployeeviewId() {
	}

	public NormalemployeeviewId(String id, String empNo, String nameCn, String sex, String birth, String personId,
			String tel, String qq, String email, int state, long deptId, long jobId, String nid, Date joinDate,
			String bank) {
		this.id = id;
		this.empNo = empNo;
		this.nameCn = nameCn;
		this.sex = sex;
		this.birth = birth;
		this.personId = personId;
		this.tel = tel;
		this.qq = qq;
		this.email = email;
		this.state = state;
		this.deptId = deptId;
		this.jobId = jobId;
		this.nid = nid;
		this.joinDate = joinDate;
		this.bank = bank;
	}

	public NormalemployeeviewId(String id, String empNo, String nameCn, String sex, String birth, String personId,
			String tel, String qq, String email, String country, int state, long deptId, long jobId, String nid,
			Date joinDate, String eduHistory, String bank) {
		this.id = id;
		this.empNo = empNo;
		this.nameCn = nameCn;
		this.sex = sex;
		this.birth = birth;
		this.personId = personId;
		this.tel = tel;
		this.qq = qq;
		this.email = email;
		this.country = country;
		this.state = state;
		this.deptId = deptId;
		this.jobId = jobId;
		this.nid = nid;
		this.joinDate = joinDate;
		this.eduHistory = eduHistory;
		this.bank = bank;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return this.birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public long getDeptId() {
		return this.deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public long getJobId() {
		return this.jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getNid() {
		return this.nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getEduHistory() {
		return this.eduHistory;
	}

	public void setEduHistory(String eduHistory) {
		this.eduHistory = eduHistory;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NormalemployeeviewId))
			return false;
		NormalemployeeviewId castOther = (NormalemployeeviewId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getEmpNo() == castOther.getEmpNo()) || (this.getEmpNo() != null
						&& castOther.getEmpNo() != null && this.getEmpNo().equals(castOther.getEmpNo())))
				&& ((this.getNameCn() == castOther.getNameCn()) || (this.getNameCn() != null
						&& castOther.getNameCn() != null && this.getNameCn().equals(castOther.getNameCn())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null && castOther.getSex() != null
						&& this.getSex().equals(castOther.getSex())))
				&& ((this.getBirth() == castOther.getBirth()) || (this.getBirth() != null
						&& castOther.getBirth() != null && this.getBirth().equals(castOther.getBirth())))
				&& ((this.getPersonId() == castOther.getPersonId()) || (this.getPersonId() != null
						&& castOther.getPersonId() != null && this.getPersonId().equals(castOther.getPersonId())))
				&& ((this.getTel() == castOther.getTel()) || (this.getTel() != null && castOther.getTel() != null
						&& this.getTel().equals(castOther.getTel())))
				&& ((this.getQq() == castOther.getQq()) || (this.getQq() != null && castOther.getQq() != null
						&& this.getQq().equals(castOther.getQq())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
						&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& (this.getState() == castOther.getState()) && (this.getDeptId() == castOther.getDeptId())
				&& (this.getJobId() == castOther.getJobId())
				&& ((this.getNid() == castOther.getNid()) || (this.getNid() != null && castOther.getNid() != null
						&& this.getNid().equals(castOther.getNid())))
				&& ((this.getJoinDate() == castOther.getJoinDate()) || (this.getJoinDate() != null
						&& castOther.getJoinDate() != null && this.getJoinDate().equals(castOther.getJoinDate())))
				&& ((this.getEduHistory() == castOther.getEduHistory()) || (this.getEduHistory() != null
						&& castOther.getEduHistory() != null && this.getEduHistory().equals(castOther.getEduHistory())))
				&& ((this.getBank() == castOther.getBank()) || (this.getBank() != null && castOther.getBank() != null
						&& this.getBank().equals(castOther.getBank())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getEmpNo() == null ? 0 : this.getEmpNo().hashCode());
		result = 37 * result + (getNameCn() == null ? 0 : this.getNameCn().hashCode());
		result = 37 * result + (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result + (getBirth() == null ? 0 : this.getBirth().hashCode());
		result = 37 * result + (getPersonId() == null ? 0 : this.getPersonId().hashCode());
		result = 37 * result + (getTel() == null ? 0 : this.getTel().hashCode());
		result = 37 * result + (getQq() == null ? 0 : this.getQq().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + this.getState();
		result = 37 * result + (int) this.getDeptId();
		result = 37 * result + (int) this.getJobId();
		result = 37 * result + (getNid() == null ? 0 : this.getNid().hashCode());
		result = 37 * result + (getJoinDate() == null ? 0 : this.getJoinDate().hashCode());
		result = 37 * result + (getEduHistory() == null ? 0 : this.getEduHistory().hashCode());
		result = 37 * result + (getBank() == null ? 0 : this.getBank().hashCode());
		return result;
	}

}
