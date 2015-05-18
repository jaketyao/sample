/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerTendency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.customerTendency.dao.CustomerTendencyDAO;
import demo.customerTendency.vo.CustomerTendencyVO;

@Service
public class CustomerTendencyService {

	@Autowired
	CustomerTendencyDAO dao;
	
	public int inputCT(CustomerTendencyVO CT) {
		return dao.inputCT(CT);
	}

	public CustomerTendencyVO pullCT(int customerSrls) {
		return dao.pullCT(customerSrls);
	}

	public int updateCT(CustomerTendencyVO CT) {
		return dao.updateCT(CT);
	}

	public List<CustomerTendencyVO> pullAllCT() {
		return dao.pullAllCT();
	}
}
