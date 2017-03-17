package com.iss.db.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Sysuser;
import com.iss.db.dao.SysuserDAO;

public class SysuserDAOImpl implements SysuserDAO {
	
	@Autowired
	HibernateTemplate htemplate;
	

	@Override
	public List<Sysuser> findAll() {
		// TODO Auto-generated method stub
		List<Sysuser> result =(List<Sysuser>) htemplate.find("from Sysuser");
 		return result;
	}

	@Override
	public Sysuser findById(Integer id) {
		// TODO Auto-generated method stub
		Sysuser result=htemplate.get(Sysuser.class, id);
		return result;
	}

	@Override
	public List<Sysuser> findByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		List<Sysuser> result =(List<Sysuser>) htemplate.find("from Sysuser as sysuser where sysuser.parentId=?",parentId);
		return result;
	}

	@Override
	public Sysuser addSysuser(Sysuser sysuser) {
		// TODO Auto-generated method stub
		htemplate.persist(sysuser);
		return sysuser;
	}

	@Override
	public boolean deleteSysuser(Sysuser sysuser) {
		// TODO Auto-generated method stub
		try{
			htemplate.delete(sysuser);
			return true;
		}catch(Exception ex){
		return false;
		}
		
		
	}

	@Override
	public boolean saveSysuser(Sysuser sysuser) {
		// TODO Auto-generated method stub
		try{
			htemplate.saveOrUpdate(sysuser);
			return true;
		}catch(Exception ex){
		return false;
		}
		}

	@Override
	public List<Sysuser> findByExample(Sysuser example) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Sysuser> findByparentIdIsNull() {
		// TODO Auto-generated method stub
		List<Sysuser> result = (List<Sysuser>) htemplate.find("from Sysuser as sysuser where sysuser.parentId = null");
		return result;
	}

	@Override
	public List<Sysuser> findByParentIdIsNull() {
		// TODO Auto-generated method stub
		return null;
	}
	}
