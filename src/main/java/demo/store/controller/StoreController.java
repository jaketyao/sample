/*
* 작성일 : 2015. 5. 18.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.store.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

	@Autowired
	private StoreService service;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(@RequestParam String email){
		return service.pullPwStore(email);
	}
	
	
}
