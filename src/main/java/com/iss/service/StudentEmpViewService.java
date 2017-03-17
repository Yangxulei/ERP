package com.iss.service;

import java.util.List;
import com.iss.db.bean.EmpStudent;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Studentemployeeview;
import com.iss.db.bean.Sysuser;

public interface StudentEmpViewService {
	public List<Studentemployeeview> find(Employee emp,EmpStudent student);

	boolean addSysuser(Sysuser sysuser);

	List<Sysuser> buildSysuserTree();

}
