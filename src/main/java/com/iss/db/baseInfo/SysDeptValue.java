package com.iss.db.baseInfo;

public class SysDeptValue {
	
	private int id;

	private String deptName;
	private String deptParent;
	private String deptComment;
	private boolean enable;
	
	public int getId(){
		return id;
	}
    public void setId(int id){
    	this.id = id;
    }
    
    
    public String getDeptName(){
    	return deptName;
    }
    public void setValue(String deptName){
    	this.deptName = deptName;
    }
    public String getDeptParent(){
    	return deptParent;
    }
    public void setDeptParent(String deptParent){
    	this.deptParent = deptParent;
    }
    public String deptComment(){
    	return deptComment;
    }
    public void setDeptComment(){
    	this.deptComment = deptComment;
    }
    
    public boolean isEnable(){
    	return enable;
    }
    public void setEnable(boolean enable){
    	this.enable = enable;
    }
}