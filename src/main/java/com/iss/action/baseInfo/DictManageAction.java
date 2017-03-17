package com.iss.action.baseInfo;
import com.iss.common.MessageData;
import com.iss.common.StringTools;
import com.iss.db.baseInfo.SysDictValue;
import com.opensymphony.xwork2.ActionSupport;

public class DictManageAction extends ActionSupport {
	private SysDictValue sysDictValue;
	private MessageData message;
	
	public String saveDictValue(){
		
		if(StringTools.isNullOrEmpty(sysDictValue.getId()+""))
			System.out.println("数据新增操作");
		else
			System.out.println("数据编辑操作");
		
		if(message==null)
			message = new MessageData();
		
		message.setMsg("成功保存,新的字典id");
		message.setSuccess(true);
		
		return SUCCESS;
	}
	public SysDictValue getSysDictValue(){
		return sysDictValue;
	}
	
	public void setSysDictValue(SysDictValue sysDictValue){
		this.sysDictValue = sysDictValue;
	}
    
	public MessageData getMessage(){
		return message;
	}
	
	public void setMessage(MessageData message){
		this.message = message;
	}
}