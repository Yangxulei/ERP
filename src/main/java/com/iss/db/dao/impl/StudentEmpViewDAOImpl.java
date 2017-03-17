package com.iss.db.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Normalemployeeview;
import com.iss.db.bean.Studentemployeeview;
import com.iss.db.dao.NormalEmpViewDAO;
import com.iss.db.dao.StudentEmpViewDAO;

public class StudentEmpViewDAOImpl implements StudentEmpViewDAO {
	
	@Autowired
	HibernateTemplate htemplate;
   @Override
	public List<Studentemployeeview> find(Studentemployeeview example) {
		// TODO Auto-generated method stub
		
		String hql = "from Studentemployeeview "
			+"where empNo like ? "
			+"  and nameCn like ? "
			+"  and bank like ? "
			+"  and tel like ? ";
		
		List values = new ArrayList();
		values.add("%" + example.getEmpNo() + "%");
		values.add("%" + example.getNameCn() + "%");
		values.add("%" + example.getBank() + "%");
		values.add("%" + example.getTel() + "%");
		
		return (List<Studentemployeeview>) htemplate.find(hql,values);
	}
}
