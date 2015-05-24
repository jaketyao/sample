/*
* 작성일 : 2015. 5. 22.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerPayRecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customerPayRecord.service.CustomerPayRecordService;
import demo.customerPayRecord.vo.CustomerPayRecordVO;

@RestController
@Repository("/customerPayRecord")
public class CustomerPayRecordController {

	@Autowired
	private CustomerPayRecordService service;
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String CustomPayRecordInput(@ModelAttribute CustomerPayRecordVO CP){
		service.inputPayRecord(CP);
		return "redirect:/customerPayRecord/list";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public String CustomerPayRecordList(@RequestParam int customerSrl,Model model){
		model.addAttribute("CPList", service.pullCustomerPayRecordList(customerSrl));
		return "customerPayRecord/list";
	}
}
