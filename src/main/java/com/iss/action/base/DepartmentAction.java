package com.iss.action.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.Department;
import com.iss.service.DepartmentService;
import com.opensymphony.xwork2.ActionSupport;

public class DepartmentAction extends ActionSupport {
	
	@Autowired
	private DepartmentService deptService;
	
	private List<Department> depts;

	private Department dept;

	private Object msg;
	
	public String buildDeptTree() {
		
		depts = deptService.buildDeptTree();
		
		return SUCCESS;
	}
	

	

	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}

}
