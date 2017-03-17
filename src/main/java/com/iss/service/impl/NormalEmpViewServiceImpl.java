package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.EmpNormal;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Normalemployeeview;
import com.iss.db.dao.NormalEmpViewDAO;
import com.iss.service.NormalEmpViewService;

public class NormalEmpViewServiceImpl implements NormalEmpViewService {
	@Autowired
	private NormalEmpViewDAO normalEmpViewDao;

	@Override
	public List<Normalemployeeview> find(Employee employee, EmpNormal normal) {
		// TODO Auto-generated method stub
		
		Normalemployeeview example = new Normalemployeeview();
		example.setEmpNo(employee.getEmpNo());
		example.setNameCn(employee.getNameCn());
		example.setTel(employee.getTel());
		example.setBank(normal.getBank());
		
		return normalEmpViewDao.find(example);
	}

}
