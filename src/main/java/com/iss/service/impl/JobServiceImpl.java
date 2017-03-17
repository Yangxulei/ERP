package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.Job;
import com.iss.db.dao.JobDAO;
import com.iss.service.JobService;

public class JobServiceImpl implements JobService {

	@Autowired
	JobDAO jobDao;
	
	@Override
	public boolean addJob(Job job) {
		// TODO Auto-generated method stub
		Job  example =new Job();
		example.setJobTitle(job.getJobTitle());
		example.setReportTo(job.reportTo);
		
		List<Job> result=jobDao.findByExample(example);
		if(result.size()==0){
			jobDao.addJob(job);
			return true;
			
		}
		return false;
	}

	@Override
	public List<Job> buildJobTree() {
		// TODO Auto-generated method stub
		return jobDao.findByparentIdIsNull();
	}

}
