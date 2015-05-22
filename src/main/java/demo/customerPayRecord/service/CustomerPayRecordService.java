/*
* 작성일 : 2015. 5. 22.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerPayRecord.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.customerPayRecord.dao.CustomerPayRecordDAO;
import demo.customerPayRecord.vo.CustomerPayRecordVO;

@Service
public class CustomerPayRecordService {
	int prepayment=0;
	int useBalance=0;
	
	@Autowired
	CustomerPayRecordDAO dao;
	
	public int inputPayRecord(CustomerPayRecordVO CP){
		return dao.inputPayRecord(CP);
	}
	
	public List<CustomerPayRecordVO> pullCustomerPayRecordList(int customerSrl){
		return dao.pullCustomerPayRecordList(customerSrl);
	}
	
	public int pullCustomerBalance(int customerSrl){
		List<CustomerPayRecordVO> CPList = dao.pullCustomerBalance(customerSrl);

		for(int i=0; i<CPList.size(); i++){
			prepayment += CPList.get(i).getPrepayment();
			useBalance += CPList.get(i).getUseBalance();
		}
		return prepayment-useBalance;
	}
	
	public double pullTodaySales(){
		List<CustomerPayRecordVO> CPList = dao.pullTodaySales();
		
		for(int i=0; i<CPList.size(); i++){
			useBalance += CPList.get(i).getUseBalance();
		}
		return useBalance/CPList.size();
	}
	
	public double pullWeekSales(){
		List<CustomerPayRecordVO> CPList = dao.pullWeekSales();
		
		for(int i=0; i<CPList.size(); i++){
			useBalance += CPList.get(i).getUseBalance();	
		}
		return useBalance/CPList.size();
	}
	
	public double pullMonthSales(){
		List<CustomerPayRecordVO> CPList = dao.pullMonthSales();
		
		for(int i=0; i<CPList.size(); i++){
			useBalance +=CPList.get(i).getUseBalance();
		}
		return useBalance/CPList.size();
	}
	
}
