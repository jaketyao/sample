/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerTendency.dao;

import java.util.List;

import demo.customerTendency.vo.CustomerTendencyVO;

public interface CustomerTendencyDAO {

	int inputCT(CustomerTendencyVO CT);
	CustomerTendencyVO pullCT(int customerSrls);
	int updateCT(CustomerTendencyVO CT);
	List<CustomerTendencyVO> pullAllCT();
}
