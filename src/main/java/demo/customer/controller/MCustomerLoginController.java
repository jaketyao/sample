/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customer.service.CustomerService;
import demo.customer.vo.CustomerVO;

@RestController
@RequestMapping("/customer/login")
public class MCustomerLoginController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public int CustomerLoginProcess(@ModelAttribute CustomerVO customer){
		return service.customerLoginProcess(customer.getEmail(), customer.getPassword());
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST) 
	public int CustomerInfoUpdate(@ModelAttribute CustomerVO customer){
		return service.updateCustomerCheck(customer);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public int CustomerInfoDelete(@ModelAttribute CustomerVO customer) {
		return service.deleteCustomerCheck(customer.getEmail());
	}
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public CustomerVO CustomerInfo(@RequestParam String email) {
		return service.customerInfo(email);
	}
	
	@RequestMapping(value="/pullSrl", method=RequestMethod.POST)
	public int CustomerPullSrl(@RequestParam String email) {
		return service.pullSrlCustomer(email);
	}

}
