package com.iss.action.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.common.ResultData;
import com.iss.db.bean.Job;
import com.iss.service.JobService;
import com.opensymphony.xwork2.ActionSupport;

public class JobAction extends ActionSupport {

	
	@Autowired
	private JobService jobService;
	//private ResultData Result;
	private List<Job> jobs;
	private Job job;
	public String buildJobTree(){
		
		
	      jobs=jobService.buildJobTree();
	      
	
		
		return SUCCESS;
		
	}

	/*public ResultData getResult() {
		return Result;
	}

	public void setResult(ResultData result) {
		Result = result;
	}*/

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
}
