package com.iss.service;

import java.util.List;


import com.iss.db.bean.EmpOuter;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Outeremployeeview;

public interface OuterEmpViewService {
	public List<Outeremployeeview> find(Employee emp,EmpOuter outer);

}
