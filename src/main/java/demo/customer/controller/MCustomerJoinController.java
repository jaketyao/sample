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
@RequestMapping("/customer/join")
public class MCustomerJoinController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public int CustomerJoinProcess(@ModelAttribute CustomerVO customer) {
		return service.customerJoinCheck(customer);
	}
	
	@RequestMapping(value="/idcheck", method=RequestMethod.POST)
	public int CustomerIdCheck(@RequestParam String email){
		return service.findCustomerCheck(email);
	}
}
