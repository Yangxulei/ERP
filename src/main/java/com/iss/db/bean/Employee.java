package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

import java.util.Date;

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private String id;
	private String nameCn;
	private String sex;
	private Date birth;
	private String birthPlace;
	private String personId;
	private String email;
	private String empNo;
	private String tel;
	private String qq;
	private Integer country;
	private Integer nationality;
	private String address;
	private int state;
	private String postCode;
	private Integer deptId;
	private Integer jobId;
	private String pic;

	public Employee() {
	}

	public Employee(String id, String nameCn, String sex, String personId, String empNo, int state) {
		this.id = id;
		this.nameCn = nameCn;
		this.sex = sex;
		this.personId = personId;
		this.empNo = empNo;
		this.state = state;
	}

	public Employee(String id, String nameCn, String sex, Date birth, String birthPlace, String personId, String email,
			String empNo, String tel, String qq, Integer country, Integer nationality, String address, int state,
			String postCode, Integer deptId, Integer jobId, String pic) {
		this.id = id;
		this.nameCn = nameCn;
		this.sex = sex;
		this.birth = birth;
		this.birthPlace = birthPlace;
		this.personId = personId;
		this.email = email;
		this.empNo = empNo;
		this.tel = tel;
		this.qq = qq;
		this.country = country;
		this.nationality = nationality;
		this.address = address;
		this.state = state;
		this.postCode = postCode;
		this.deptId = deptId;
		this.jobId = jobId;
		this.pic = pic;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getBirthPlace() {
		return this.birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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

	public Integer getCountry() {
		return this.country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public Integer getNationality() {
		return this.nationality;
	}

	public void setNationality(Integer nationality) {
		this.nationality = nationality;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

}
