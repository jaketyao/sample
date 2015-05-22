/*
* 작성일 : 2015. 5. 22.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerPayRecord.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.customerPayRecord.vo.CustomerPayRecordVO;

@RestController
@Repository("/customerPayRecord")
public class CustomerPayRecordController {

	@Autowired
	private CustomerPayRecordVO CP;
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
}
