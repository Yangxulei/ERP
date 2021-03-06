package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

/**
 * StudentemployeeviewId generated by hbm2java
 */
public class StudentemployeeviewId implements java.io.Serializable {

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
	private String sid;
	private String school;
	private String slevel;
	private String interest;
	private long payType;
	private String payTypeName;
	private long payCount;

	public StudentemployeeviewId() {
	}

	public StudentemployeeviewId(String id, String empNo, String nameCn, String sex, String birth, String personId,
			String tel, String qq, String email, int state, long deptId, long jobId, String sid, String school,
			String interest, long payType, long payCount) {
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
		this.sid = sid;
		this.school = school;
		this.interest = interest;
		this.payType = payType;
		this.payCount = payCount;
	}

	public StudentemployeeviewId(String id, String empNo, String nameCn, String sex, String birth, String personId,
			String tel, String qq, String email, String country, int state, long deptId, long jobId, String sid,
			String school, String slevel, String interest, long payType, String payTypeName, long payCount) {
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
		this.sid = sid;
		this.school = school;
		this.slevel = slevel;
		this.interest = interest;
		this.payType = payType;
		this.payTypeName = payTypeName;
		this.payCount = payCount;
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

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSlevel() {
		return this.slevel;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public String getInterest() {
		return this.interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public long getPayType() {
		return this.payType;
	}

	public void setPayType(long payType) {
		this.payType = payType;
	}

	public String getPayTypeName() {
		return this.payTypeName;
	}

	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}

	public long getPayCount() {
		return this.payCount;
	}

	public void setPayCount(long payCount) {
		this.payCount = payCount;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StudentemployeeviewId))
			return false;
		StudentemployeeviewId castOther = (StudentemployeeviewId) other;

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
				&& ((this.getSid() == castOther.getSid()) || (this.getSid() != null && castOther.getSid() != null
						&& this.getSid().equals(castOther.getSid())))
				&& ((this.getSchool() == castOther.getSchool()) || (this.getSchool() != null
						&& castOther.getSchool() != null && this.getSchool().equals(castOther.getSchool())))
				&& ((this.getSlevel() == castOther.getSlevel()) || (this.getSlevel() != null
						&& castOther.getSlevel() != null && this.getSlevel().equals(castOther.getSlevel())))
				&& ((this.getInterest() == castOther.getInterest()) || (this.getInterest() != null
						&& castOther.getInterest() != null && this.getInterest().equals(castOther.getInterest())))
				&& (this.getPayType() == castOther.getPayType())
				&& ((this.getPayTypeName() == castOther.getPayTypeName())
						|| (this.getPayTypeName() != null && castOther.getPayTypeName() != null
								&& this.getPayTypeName().equals(castOther.getPayTypeName())))
				&& (this.getPayCount() == castOther.getPayCount());
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
		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		result = 37 * result + (getSchool() == null ? 0 : this.getSchool().hashCode());
		result = 37 * result + (getSlevel() == null ? 0 : this.getSlevel().hashCode());
		result = 37 * result + (getInterest() == null ? 0 : this.getInterest().hashCode());
		result = 37 * result + (int) this.getPayType();
		result = 37 * result + (getPayTypeName() == null ? 0 : this.getPayTypeName().hashCode());
		result = 37 * result + (int) this.getPayCount();
		return result;
	}

}
