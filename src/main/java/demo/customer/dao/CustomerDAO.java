/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customer.dao;

import java.util.List;

import demo.customer.vo.CustomerVO;

public interface CustomerDAO {
	int joinCustomer(CustomerVO customer);
	String pullPwCustomer(String email);
	CustomerVO findCustomer(String email);
	int updateCustomer(CustomerVO customer);
	int deleteCustomer(String email);
	CustomerVO loginCustomer(String email, String password);
	int pullSrlCustomer(String email);
	List<CustomerVO> pullAllCustomer();
	CustomerVO pullCustomer(int srl);
}
