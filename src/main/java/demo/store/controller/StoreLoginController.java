/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.store.service.StoreService;

@RestController
@RequestMapping("/store/login")
public class StoreLoginController {

	@Autowired
	private StoreService service;
	
	@RequestMapping(value="/main")
	public String StoreLoginMainPage(){
		return "store/main";
	}

}
