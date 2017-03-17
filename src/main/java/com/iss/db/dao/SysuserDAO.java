package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Sysuser;

public interface SysuserDAO {

	/**
	 * ����ȫ��
	 * @return
	 */
	public List<Sysuser> findAll();
	
	/**
	 * ����������ĳһ��ĳһ������
	 * @param id
	 * @return
	 */
	public Sysuser findById(Integer id);
	
	/**
	 * �����ű�Ų���������������
	 * @param parentId
	 * @return
	 */
	public List<Sysuser> findByParentId(Integer parentId);
	
	/**
	 * ��������
	 * @param dept
	 * @return
	 */
	public Sysuser addSysuser(Sysuser sysuser);
	
	/**
	 * ɾ������
	 * @param dept
	 * @return
	 */
	public boolean deleteSysuser(Sysuser sysuser);
	
	
	/**
	 * ���沿�ţ��Զ�������������Ǹ��£�
	 * @param dept
	 * @return
	 */
	public boolean saveSysuser(Sysuser sysuser);
	
	public List<Sysuser> findByExample(Sysuser sysuser);

	public List<Sysuser> findByParentIdIsNull();
	
}
