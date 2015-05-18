/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerTendency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customerTendency.service.CustomerTendencyService;
import demo.customerTendency.vo.CustomerTendencyVO;

@RestController
@RequestMapping("/CustomerTendency")
public class MCustomerTendencyController {
	
	@Autowired
	private CustomerTendencyService service;
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public  int CTinput(@ModelAttribute CustomerTendencyVO CT){
		return service.inputCT(CT);
	}
	
	@RequestMapping(value="/pull", method=RequestMethod.POST)
	public CustomerTendencyVO CTpull(@RequestParam int customerSrls){
		return service.pullCT(customerSrls);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public  int CTupdate(@ModelAttribute CustomerTendencyVO CT){
		return service.updateCT(CT);
	}
}
