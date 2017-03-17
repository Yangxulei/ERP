package com.iss.db.baseInfo;

public class SysUserValue {
	
	private Integer id;
	private int uid;
	private String pwd;
	private String displayname;
	private String desc;
	private boolean enable;
    private String role;
	
	public Integer getId(){
		return id;
	}
    public void setId(Integer id){
    	this.id =  id;
    }
    public int getUid(){
    	return  uid;
    }
    public void setUid(int uid){
    	this.uid = uid;
    }
    public String getPwd(){
    	return pwd;
    }
    public void setPwd(String pwd){
    	this.pwd=pwd;
    }
    public String getDesc(){
    	return desc;
    }
    public void setDesc(String desc){
    	this.desc=desc;
    }
    public String getRole(){
    	return role;
    }
    
    public void setrole(String role){
    	this.role = role;
    }
   public boolean getEnable(){
	   return enable;
   }
   
    
    public void isEnable(boolean enable){
    	this.enable=enable;
    }
}