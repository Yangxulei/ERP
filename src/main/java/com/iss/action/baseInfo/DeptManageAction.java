package com.iss.action.baseInfo;
import com.iss.common.MessageData;
import com.iss.common.StringTools;
import com.iss.db.baseInfo.SysDeptValue;
import com.opensymphony.xwork2.ActionSupport;

public class DeptManageAction extends ActionSupport {
	private SysDeptValue sysDeptValue;
	private MessageData message;
	
	public String saveDeptValue(){
		
		if(StringTools.isNullOrEmpty(sysDeptValue.getId()+""))
			System.out.println("数据新增操作");
		else
			System.out.println("数据编辑操作");
		
		if(message==null)
			message = new MessageData();
		
		message.setMsg("成功保存,新的信息id为12222");
		message.setSuccess(true);
		return SUCCESS;
	}
	public SysDeptValue getSysDeptValue(){
		return sysDeptValue;
	}
	
	public void setSysDeptValue(SysDeptValue sysDeptValue){
		this.sysDeptValue = sysDeptValue;
	}
    
	public MessageData getMessage(){
		return message;
	}
	
	public void setMessage(MessageData message){
		this.message = message;
	}
}