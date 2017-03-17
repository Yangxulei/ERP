package com.iss.action.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.common.MessageData;
import com.iss.db.bean.Employee;
import com.iss.db.bean.Payment;
import com.iss.service.PaymentService;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport {
	@Autowired
	private PaymentService employeepayservice;
	private Employee employee;
	private Payment  payment;
	private MessageData msg;
	public String saveEmpPay(){
	     msg = new MessageData();
	     System.out.println("主键值为"+payment.getId());
		boolean result = employeepayservice.updateEmployeepayment(payment);
		
		if(result){
		msg.setSuccess(true);
		msg.setMsg("修改成功");
		}else{
			msg.setMsg("更新失败");
		}
		return SUCCESS;
	}
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public MessageData getMsg() {
		return msg;
	}
	public void setMsg(MessageData msg) {
		this.msg = msg;
	}
	
	
}
