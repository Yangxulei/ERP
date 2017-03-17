package com.iss.action.baseInfo;
import com.iss.common.MessageData;
import com.iss.common.StringTools;
import com.iss.db.baseInfo.SysUserValue;
import com.opensymphony.xwork2.ActionSupport;

public class SysUserManageAction extends ActionSupport {
	private SysUserValue sysUserValue;
	private MessageData message;
	
public String saveUserValue(){
		
		if(StringTools.isNullOrEmpty(sysUserValue.getId()+""))
			System.out.println("数据新增操作");
		else
			System.out.println("数据编辑操作");
		
		if(message==null)
			message = new MessageData();
		
		message.setMsg("成功保存,新的字典id为12222");
		message.setSuccess(true);
		
		return SUCCESS;
	}
	public SysUserValue getSysUserValue(){
		return sysUserValue;
	}
	
	public void setSysUserValue(SysUserValue sysUserValue){
		this.sysUserValue = sysUserValue;
	}
    
	public MessageData getMessage(){
		return message;
	}
	
	public void setMessage(MessageData message){
		this.message = message;
	}
}