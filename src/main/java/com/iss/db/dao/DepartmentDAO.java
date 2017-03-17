package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Department;

public interface DepartmentDAO {
   /**
    * 查找全部
    * @return
     */
	public List<Department> findAll();
	
	public Department findById(Integer id);
	
	public List<Department> findByParentId(Integer parentId);
	/**
	   * 新增部门
	   * @param dept
	   * @return
	   */
	public Department addDepartment(Department dept);
	
	public boolean deleteDepartment(Department dept);
	
	public boolean saveDepartment(Department dept);


	public List<Department> findByExample(Department example);
	
	//查空
	public List<Department> findByparentIdIsNull();


	List<Department> findByParentIdIsNull();
}