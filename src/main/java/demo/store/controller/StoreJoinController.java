/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.store.service.StoreService;
import demo.store.vo.StoreVO;

@RestController
@RequestMapping("/store/join")
public class StoreJoinController {
	
	@Autowired
	private StoreService service;
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String StoreJoinProcess(@ModelAttribute StoreVO store, Model model) {
		model.addAttribute("joincheck", service.joinStore(store));
		return "redirect:/store/login/main";
	}
	
	@RequestMapping(value="/")
	public String StoreJoinPage(){
		return "store/join";
	}
	

}
