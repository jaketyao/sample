/*
* 작성일 : 2015. 5. 22.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerPayRecord.dao;

import java.util.List;

import demo.customerPayRecord.vo.CustomerPayRecordVO;

public interface CustomerPayRecordDAO {
	
	public int inputPayRecord(CustomerPayRecordVO CP);
	public List<CustomerPayRecordVO> pullCustomerPayRecordList(int customerSrl);
	public List<CustomerPayRecordVO> pullCustomerBalance(int customerSrl);
	public List<CustomerPayRecordVO> pullTodaySales();
	public List<CustomerPayRecordVO> pullWeekSales();
	public List<CustomerPayRecordVO> pullMonthSales();
}
