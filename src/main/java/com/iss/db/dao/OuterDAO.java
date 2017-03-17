package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Outer;

public interface OuterDAO {

	
public List<Outer> findAll();
	
	
	public Outer findById(Integer id);
	
	public List<Outer> findByParentId(Integer parentId);
	
	public Outer addOuter(Outer outer);
	
	public boolean deleteOuter(Outer outer);
	
	public boolean saveOuter(Outer outer);


	public List<Outer> findByExample(Outer example);
	
	//查空
	public List<Outer> findByparentIdIsNull();


	List<Outer> findByreportToIsNull();


	List<Outer> findByreportTo(Integer reportTo);


	List<Outer> findByParentIdIsNull();
}
