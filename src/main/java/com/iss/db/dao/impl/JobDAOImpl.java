package com.iss.db.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Job;
import com.iss.db.dao.JobDAO;

public class JobDAOImpl implements JobDAO {
	
	
	
	@Autowired
	HibernateTemplate htemplate;

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		List<Job> result = (List<Job>)htemplate.find("from Job");
		return result;
	}

	@Override
	public Job findById(Integer id) {
		// TODO Auto-generated method stub
		Job result=htemplate.get(Job.class, id);
		return result;
	}

	@Override
	public List<Job> findByreportTo(Integer reportTo) {
		// TODO Auto-generated method stub
		List<Job> result=(List<Job>)htemplate.find("from Job as job where job.reportTo=?", reportTo);
		return result;
	}

	@Override
	public Job addJob(Job job) {
		// TODO Auto-generated method stub
		htemplate.persist(job);
		return job;
	}

	@Override
	public boolean deleteJob(Job job) {
		// TODO Auto-generated method stub
		try{
			htemplate.delete(job);
			return true;
		}catch(Exception ex){
			
		
		return false;
	}
	}

	@Override
	public boolean saveJob(Job job) {
		// TODO Auto-generated method stub
		try{
			htemplate.save(job);
			return true;
			
		}catch(Exception ex){
		return false;
	}
		}

	@Override
	public List<Job> findByExample(Job example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findByreportToIsNull() {
		// TODO Auto-generated method stub
		List<Job> result=(List<Job>) htemplate.find("from Job as job where job.reportTo is null");
		return result;
	}

	@Override
	public List<Job> findByParentId(Integer parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findByparentIdIsNull() {
		List<Job>	result = (List<Job>) htemplate.find("from Job as job where job.reportTo =null");
		return result;
	}

	

}
