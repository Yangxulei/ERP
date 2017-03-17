package com.iss.action.employee;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.common.ResultData;

import com.iss.db.bean.EmpStudent;
import com.iss.db.bean.Employee;

import com.iss.service.StudentEmpViewService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentEmployeeAction extends ActionSupport {
    @Autowired
    private StudentEmpViewService empViewService;
    
    private Employee employee;
    private EmpStudent student;
    
    private ResultData emps;
    
    public String searchEmloyee(){
    	if(emps == null)
    		emps = new ResultData();
    	emps.setRows(empViewService.find(employee,student));
    	return SUCCESS;
    }
    
    public ResultData getEmps(){
    	return emps;
    }
    
    public void setEmps(ResultData emps){
    	this.emps = emps;
    }
    
    public EmpStudent getNormal(){
    	return student;
    }
    
    public void setStudent(EmpStudent student){
    	this.student = student;
    }
    
    public Employee getEmployee(){
    	return employee;
    }
    
    public void setEmployee(Employee employee){
    	this.employee = employee;
    }
  	
}

