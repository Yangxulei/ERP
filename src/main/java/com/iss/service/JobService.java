package com.iss.service;

import java.util.List;

import com.iss.db.bean.Job;

public interface JobService {
 
	public boolean  addJob(Job job);

	public List<Job> buildJobTree();
}
