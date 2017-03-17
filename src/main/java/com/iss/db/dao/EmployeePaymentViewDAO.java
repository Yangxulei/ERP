package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Employeepaymentview;

public interface EmployeePaymentViewDAO {

	
	public List<Employeepaymentview> find(Employeepaymentview example);
}
