package com.iss.db.dao;

import java.util.List;

import com.iss.db.bean.Payment;


public interface PaymentDAO {


	boolean updatePayment(Payment payment);

	List<Payment> findById(String id);
}
