package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.Department;
import com.iss.db.dao.DepartmentDAO;
import com.iss.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO deptDao;
	
	@Override
	public boolean addDepartment(Department dept) {
		// TODO Auto-generated method stub
		Department example = new Department();
		example.setDeptName(dept.getDeptName());
		example.setParentId(dept.getParentId());
		
		
		List<Department> result = deptDao.findByExample(example);
		if(result.size()==0){
			deptDao.addDepartment(dept);
			return true;
		}
		return false;
	}

	@Override
	public boolean saveDepartment(Department dept){
		// TODO Auto-generated method stub
		return deptDao.saveDepartment(dept);
	}
	
	@Override
	public List<Department> buildDeptTree() {
		// TODO Auto-generated method stub
		return deptDao.findByparentIdIsNull();
	}
	

}