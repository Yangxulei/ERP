package com.iss.db.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.iss.db.bean.Payment;
import com.iss.db.bean.Studentemployeeview;
import com.iss.db.dao.PaymentDAO;

public class PaymentDAOImpl implements PaymentDAO {

	
	@Autowired
	HibernateTemplate htmplate;
	
	@Override
	public boolean updatePayment(Payment payment) {
		try{
			htmplate.saveOrUpdate(payment);
			return true;
		}catch(Exception ex){
			return false;
		}
		
		
	}
	@Override
	public List<Payment >findById(String id) {		
		
		List<Payment> result =   (List<Payment>) htmplate.find("from Payment as pay where pay.id = ?",id);
			System.out.println("bbbbb"+result.size());
			
		
			return result ;
		
			 
		
	}

}
