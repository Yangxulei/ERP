package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.EmpOuter;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Outeremployeeview;
import com.iss.db.dao.OuterEmpViewDAO;
import com.iss.service.OuterEmpViewService;

public class OuterEmpViewServiceImpl implements OuterEmpViewService {
	@Autowired
	private OuterEmpViewDAO outerEmpViewDao;

	@Override
	public List<Outeremployeeview> find(Employee employee, EmpOuter outer) {
		// TODO Auto-generated method stub
		
		Outeremployeeview example = new Outeremployeeview();
		example.setEmpNo(employee.getEmpNo());
		example.setNameCn(employee.getNameCn());
		example.setTel(employee.getTel());
		
		return outerEmpViewDao.find(example);
	}

}
