package com.iss.service;

import java.util.List;


import com.iss.db.bean.EmpJobbing;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Jobbingemployeeview;

public interface JobbingEmpViewService {
	public List<Jobbingemployeeview> find(Employee emp,EmpJobbing jobbing);

}
