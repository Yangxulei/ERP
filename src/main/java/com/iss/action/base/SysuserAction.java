package com.iss.action.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.Sysuser;
import com.iss.service.StudentEmpViewService;
import com.opensymphony.xwork2.ActionSupport;

public class SysuserAction extends ActionSupport {
	
	@Autowired
	private StudentEmpViewService sysuserService;
	
	private List<Sysuser> sysusers;
	
	public String buildSysuserTree() {
		
		sysusers = sysuserService.buildSysuserTree();
		
		return SUCCESS;
	}

	public List<Sysuser> getSysusers() {
		return sysusers;
	}

	public void setSysusers(List<Sysuser> sysusers) {
		this.sysusers = sysusers;
	}

}
