package com.iss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iss.db.bean.Employeepaymentview;
import com.iss.db.bean.Payment;
import com.iss.db.dao.EmployeePaymentViewDAO;
import com.iss.db.dao.PaymentDAO;
import com.iss.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private EmployeePaymentViewDAO empdao;
	@Autowired
	private PaymentDAO paymentDAO;
	/*'employee.nameCn':$('#tbxNameCn').val(),
	'employee.empNo':$('#tbxEmpNo').val(),
	'employee.deptName':$('#selJob').combotree('getValue'),
	'employee.jobTitle':$('#selDept').combotree('getValue')*/
	@Override
	public List<Employeepaymentview> find(Employeepaymentview empl) {
		// TODO Auto-generated method stub
		Employeepaymentview example = new Employeepaymentview();
		example.setNameCn(empl.getNameCn());

		if(empl.getEmpno().equals("")){
			example.setEmpno(empl.getEmpno().valueOf("J"));
		}else if(empl.getEmpno() != "J"&&empl.getEmpno() !="E" ){
			example.setEmpno(empl.getEmpno().valueOf("J"+"%"+empl.getEmpno()+"%"));
		}else if(empl.getEmpno()=="E"){
			example.setEmpno(empl.getEmpno().valueOf("J"+empl.getEmpno()));
		}
		example.setDeptId(empl.getDeptId());
		example.setJobId(empl.getJobId());
		
		return empdao.find(example);
	}
	@Override
public boolean updateEmployeepayment(Payment payment) {	
		
		System.out.println("呵呵"+payment.getId());
		Payment pay =  paymentDAO.findById(payment.getId()).get(0);//查找主键值即：id				
			/*pay.setId(payment.getId());*/
			pay.setEmpId(payment.getEmpId());
			pay.setBase(payment.getBase());
			pay.setJob(payment.getJob());
			pay.setTraffic(payment.getTraffic());
			pay.setCommunicate(payment.getCommunicate());
			pay.setTrip(payment.getTrip());
			pay.setEndowment(payment.getEndowment());
			pay.setMedical(payment.getMedical());
			pay.setUnemployment(payment.getUnemployment());
			pay.setPafhc(payment.getPafhc());							
			  boolean result = paymentDAO.updatePayment(pay);
			 if(result){
				 return true;
			 }else{
				 return false;
			 }
				
		
		
	}
}