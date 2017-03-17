package com.iss.db.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Outer;
import com.iss.db.dao.JobDAO;
import com.iss.db.dao.OuterDAO;

public class OuterDAOImpl implements OuterDAO {
	
	@Autowired
	HibernateTemplate htemplate;
	

	@Override
	public List<Outer> findAll() {
		// TODO Auto-generated method stub
		List<Outer> result =(List<Outer>) htemplate.find("from Outer");
 		return result;
	}

	@Override
	public Outer findById(Integer id) {
		// TODO Auto-generated method stub
		Outer result=htemplate.get(Outer.class, id);
		return result;
	}

	@Override
	public List<Outer> findByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		List<Outer> result =(List<Outer>) htemplate.find("from Outer as dept where dept.parentId=?",parentId);
		return result;
	}

	@Override
	public Outer addOuter(Outer dept) {
		// TODO Auto-generated method stub
		htemplate.persist(dept);
		return dept;
	}

	@Override
	public boolean deleteOuter(Outer dept) {
		// TODO Auto-generated method stub
		try{
			htemplate.delete(dept);
			return true;
		}catch(Exception ex){
		return false;
		}
		
		
	}

	@Override
	public boolean saveOuter(Outer dept) {
		// TODO Auto-generated method stub
		try{
			htemplate.saveOrUpdate(dept);
			return true;
		}catch(Exception ex){
		return false;
		}
		}

	@Override
	public List<Outer> findByExample(Outer example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Outer> findByparentIdIsNull() {
		// TODO Auto-generated method stub
		List<Outer> result = (List<Outer>) htemplate.find("from Outer as dept where dept.parentId = null");
		return result;
	}

	@Override
	public List<Outer> findByParentIdIsNull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Outer> findByreportToIsNull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Outer> findByreportTo(Integer reportTo) {
		// TODO Auto-generated method stub
		return null;
	}
	}
