package com.iss.db.baseInfo;

public class SysJobValue {
	
	private int id;

	private String deptName;
	private String deptParent;

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
    
    public boolean isEnable(){
    	return enable;
    }
    public void setEnable(boolean enable){
    	this.enable = enable;
    }
}