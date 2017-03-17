package com.iss.action.baseInfo;
import com.iss.common.MessageData;
import com.iss.db.baseInfo.SysJobValue;
import com.opensymphony.xwork2.ActionSupport;

public class JobManageAction extends ActionSupport {
	private SysJobValue sysJobValue;
	private MessageData message;
	
	public String saveJobValue(){
		
		System.out.println(sysJobValue.getDeptName());
		if(message==null)
			message = new MessageData();
		message.setMsg("成功保存");
		message.setSuccess(true);
		
		return SUCCESS;
	}
	public SysJobValue getSysJobValue(){
		return sysJobValue;
	}
	
	public void setSysJobValue(SysJobValue sysJobValue){
		this.sysJobValue = sysJobValue;
	}
    
	public MessageData getMessage(){
		return message;
	}
	
	public void setMessage(MessageData message){
		this.message = message;
	}
}