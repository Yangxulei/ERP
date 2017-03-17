package com.iss.service;

import java.util.List;


import com.iss.db.bean.EmpNormal;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Normalemployeeview;

public interface NormalEmpViewService {
	public List<Normalemployeeview> find(Employee emp,EmpNormal normal);

}
