package com.iss.db.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Jobbingemployeeview;
import com.iss.db.dao.JobbingEmpViewDAO;

public class JobbingEmpViewDAOImpl implements JobbingEmpViewDAO {
	
	@Autowired
	HibernateTemplate htemplate;

	@Override
	public List<Jobbingemployeeview> find(Jobbingemployeeview example) {
		// TODO Auto-generated method stub
		
		String hql = "from Normalemployeeview "
			+"where empNo like ? "
			+"  and nameCn like ? "
			+"  and bank like ? "
			+"  and tel like ? ";
		
		List values = new ArrayList();
		values.add("%" + example.getEmpNo() + "%");
		values.add("%" + example.getNameCn() + "%");
		values.add("%" + example.getBank() + "%");
		values.add("%" + example.getId() + "%");
		
		return (List<Jobbingemployeeview>) htemplate.find(hql,values);
	}
}
