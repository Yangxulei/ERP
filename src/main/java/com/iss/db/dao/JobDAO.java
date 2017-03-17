package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Job;

public interface JobDAO {

	
public List<Job> findAll();
	
	
	public Job findById(Integer id);
	
	public List<Job> findByParentId(Integer parentId);
	
	public Job addJob(Job job);
	
	public boolean deleteJob(Job job);
	
	public boolean saveJob(Job job);


	public List<Job> findByExample(Job example);
	
	//查空
	public List<Job> findByparentIdIsNull();


	List<Job> findByreportToIsNull();


	List<Job> findByreportTo(Integer reportTo);
}
