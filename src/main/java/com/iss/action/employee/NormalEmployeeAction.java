package com.iss.action.employee;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.common.ResultData;
import com.iss.db.bean.EmpNormal;
import com.iss.db.bean.Employee;
import com.iss.service.NormalEmpViewService;
import com.opensymphony.xwork2.ActionSupport;

public class NormalEmployeeAction extends ActionSupport {
    @Autowired
    private NormalEmpViewService empViewService;
    
    private Employee employee;
    private EmpNormal normal;
    
    private ResultData emps;
    
    public String searchEmloyee(){
    	if(emps == null)
    		emps = new ResultData();
    	emps.setRows(empViewService.find(employee,normal));
    	return SUCCESS;
    }
    
    public ResultData getEmps(){
    	return emps;
    }
    
    public void setEmps(ResultData emps){
    	this.emps = emps;
    }
    
    public EmpNormal getNormal(){
    	return normal;
    }
    
    public void setNormal(EmpNormal normal){
    	this.normal = normal;
    }
    
    public Employee getEmployee(){
    	return employee;
    }
    
    public void setEmployee(Employee employee){
    	this.employee = employee;
    }
  	
}

