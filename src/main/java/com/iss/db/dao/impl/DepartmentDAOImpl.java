package com.iss.db.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Department;
import com.iss.db.dao.DepartmentDAO;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	HibernateTemplate htemplate;
	

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		List<Department> result =(List<Department>) htemplate.find("from Department");
 		return result;
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		Department result=htemplate.get(Department.class, id);
		return result;
	}

	@Override
	public List<Department> findByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		List<Department> result =(List<Department>) htemplate.find("from Dempartment as dept where dept.parentId=?",parentId);
		return result;
	}

	@Override
	public Department addDepartment(Department dept) {
		// TODO Auto-generated method stub
		htemplate.persist(dept);
		return dept;
	}

	@Override
	public boolean deleteDepartment(Department dept) {
		// TODO Auto-generated method stub
		try{
			htemplate.delete(dept);
			return true;
		}catch(Exception ex){
		return false;
		}
		
		
	}

	@Override
	public boolean saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		try{
			htemplate.saveOrUpdate(dept);
			return true;
		}catch(Exception ex){
		return false;
		}
		}

	@Override
	public List<Department> findByExample(Department example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findByparentIdIsNull() {
		// TODO Auto-generated method stub
		List<Department> result = (List<Department>) htemplate.find("from Department as dept where dept.parentId = null");
		return result;
	}

	@Override
	public List<Department> findByParentIdIsNull() {
		// TODO Auto-generated method stub
		return null;
	}
	}
