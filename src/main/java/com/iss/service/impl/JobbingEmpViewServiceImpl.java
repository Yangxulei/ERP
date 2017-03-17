package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.EmpJobbing;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Jobbingemployeeview;
import com.iss.db.dao.JobbingEmpViewDAO;
import com.iss.service.JobbingEmpViewService;

public class JobbingEmpViewServiceImpl implements JobbingEmpViewService {
	@Autowired
	private JobbingEmpViewDAO jobbingEmpViewDao;

	@Override
	public List<Jobbingemployeeview> find(Employee employee, EmpJobbing jobbing) {
		// TODO Auto-generated method stub
		
		Jobbingemployeeview example = new Jobbingemployeeview();
		example.setEmpNo(employee.getEmpNo());
		example.setNameCn(employee.getNameCn());
		example.setId(employee.getTel());

		
		return jobbingEmpViewDao.find(example);
	}

}


