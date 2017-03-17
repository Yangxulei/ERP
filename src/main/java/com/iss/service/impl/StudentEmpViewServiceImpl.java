package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.iss.db.bean.EmpStudent;
import com.iss.db.bean.Employee;

import com.iss.db.bean.Studentemployeeview;

import com.iss.db.dao.StudentEmpViewDAO;

import com.iss.service.StudentEmpViewService;

public abstract class StudentEmpViewServiceImpl implements StudentEmpViewService {
	@Autowired
	private StudentEmpViewDAO studentEmpViewDao;

	@Override
	public List<Studentemployeeview> find(Employee employee, EmpStudent student) {
		// TODO Auto-generated method stub
		
		Studentemployeeview example = new Studentemployeeview();
		example.setEmpNo(employee.getEmpNo());
		example.setNameCn(employee.getNameCn());
		example.setTel(employee.getTel());
		example.setBank(student.getBank());
		
		return studentEmpViewDao.find(example);
	}

}
