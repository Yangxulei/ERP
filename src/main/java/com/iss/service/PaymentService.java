package com.iss.service;

import java.util.List;

import com.iss.db.bean.Employeepaymentview;
import com.iss.db.bean.Payment;

public interface PaymentService {

	public List<Employeepaymentview> find(Employeepaymentview empl);

	//public boolean addemp(Employeepaymentview employee);
	public boolean updateEmployeepayment(Payment payment);
}
