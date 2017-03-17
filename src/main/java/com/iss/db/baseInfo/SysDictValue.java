package com.iss.db.baseInfo;

public class SysDictValue {
	
	private Integer id;
	private int typeId;
	private String value;
	private String show;
	private String desc;
	private boolean enable;
	
	public int getId(){
		return id;
	}
    public void setId(Integer id){
    	this.id = id;
    }
    public Integer getTypeId(){
    	return typeId;
    }
    public void setTypeId(int typeId){
    	this.typeId = typeId;
    }
    public String getValue(){
    	return value;
    }
    public void setValue(String value){
    	this.value = value;
    }
    public String getShow(){
    	return show;
    }
    public void setShow(String show){
    	this.show = show;
    }
    public String getDesc(){
    	return desc;
    }
    public void setDesc(String Desc){
    	this.desc = desc;
    }
    public boolean isEnable(){
    	return enable;
    }
    public void setEnable(boolean enable){
    	this.enable = enable;
    }
}