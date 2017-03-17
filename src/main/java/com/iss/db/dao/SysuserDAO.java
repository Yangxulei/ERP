package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Sysuser;

public interface SysuserDAO {

	/**
	 * 查找全部
	 * @return
	 */
	public List<Sysuser> findAll();
	
	/**
	 * 按主键查找某一个某一个部门
	 * @param id
	 * @return
	 */
	public Sysuser findById(Integer id);
	
	/**
	 * 按部门编号查找所有下属部门
	 * @param parentId
	 * @return
	 */
	public List<Sysuser> findByParentId(Integer parentId);
	
	/**
	 * 新增部门
	 * @param dept
	 * @return
	 */
	public Sysuser addSysuser(Sysuser sysuser);
	
	/**
	 * 删除部门
	 * @param dept
	 * @return
	 */
	public boolean deleteSysuser(Sysuser sysuser);
	
	
	/**
	 * 保存部门（自动甄别是新增还是更新）
	 * @param dept
	 * @return
	 */
	public boolean saveSysuser(Sysuser sysuser);
	
	public List<Sysuser> findByExample(Sysuser sysuser);

	public List<Sysuser> findByParentIdIsNull();
	
}
