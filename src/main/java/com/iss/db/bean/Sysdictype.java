package com.iss.db.bean;
// Generated 2017-3-8 16:19:15 by Hibernate Tools 4.3.5.Final

/**
 * Sysdictype generated by hbm2java
 */
public class Sysdictype implements java.io.Serializable {

	private Integer id;
	private String name;
	private String desc;
	private Byte enable;

	public Sysdictype() {
	}

	public Sysdictype(String name) {
		this.name = name;
	}

	public Sysdictype(String name, String desc, Byte enable) {
		this.name = name;
		this.desc = desc;
		this.enable = enable;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}
