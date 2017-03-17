package com.iss.service;

import java.util.List;

import com.iss.db.bean.Department;

public interface DepartmentService {
	
	public boolean addDepartment(Department dept);
	public boolean saveDepartment(Department dept);

	List<Department> buildDeptTree();

}
