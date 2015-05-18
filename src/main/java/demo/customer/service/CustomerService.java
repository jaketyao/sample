/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.customer.dao.CustomerDAO;
import demo.customer.vo.CustomerVO;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO dao;
	
	public int customerJoinCheck(CustomerVO customer) {
		return dao.joinCustomer(customer);
	}

	public String customerFindPw(String email) {
		return dao.pullPwCustomer(email);
	}

	public int findCustomerCheck(String email) {
		if(dao.findCustomer(email)!=null)
			return 1;
		else return 0;
	}

	public int updateCustomerCheck(CustomerVO customer) {
		return dao.updateCustomer(customer);
	}

	public int deleteCustomerCheck(String email) {
		return dao.deleteCustomer(email);
	}

	public int customerLoginProcess(String email, String password) {
		if(dao.loginCustomer(email, password)!=null)
			return 1;
		else return 0;
	}

	public CustomerVO customerInfo(String email) {
		return dao.findCustomer(email);
	}

	public int pullSrlCustomer(String email) {
		return dao.pullSrlCustomer(email);
	}

	public List<CustomerVO> pullAllCustomer() {
		return dao.pullAllCustomer();
	}

	public CustomerVO pullCustomer(int srl) {
		// TODO Auto-generated method stub
		return dao.pullCustomer(srl);
	}
}
