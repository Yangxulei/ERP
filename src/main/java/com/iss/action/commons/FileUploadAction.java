package com.iss.action.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;
import com.iss.common.MessageData;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	private File upload;
	private String title;
	private String uploadContentType;
	private String uploadFileName;
	private MessageData message;
	private String type;
	
	public String fileUpload(){
		
		 String uploadPath = "upload/normal";
		 String savePath = ServletActionContext.getServletContext()
				 .getRealPath("/"+uploadPath);
		 System.out.println(type);
	String	s= savePath+"\\"+this.getUploadFileName();
	 File t = this.getUpload();	
	 
	 
	
	 
	 
		try {
			String save = savePath+"\\"+this.getUploadFileName();
			FileOutputStream  fos=new FileOutputStream(savePath+"\\"+this.getUploadFileName());
			FileInputStream   fis = new FileInputStream(t);
			byte[] buffer= new byte[1024];
			int len=0;			
			while((len=fis.read(buffer))>0){
					fos.write(buffer,0,len);
				}
			
			message = new MessageData();
			message.setMsg(uploadPath+"/"+this.getUploadFileName());
			message.setSuccess(true);
		} catch (Exception ex) {
			//throw new RuntimeException();// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return SUCCESS;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public MessageData getMessage() {
		return message;
	}

	public void setMessage(MessageData message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}