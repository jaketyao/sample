/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.item.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.customerTendency.service.CustomerTendencyService;
import demo.customerTendency.vo.CustomerTendencyVO;
import demo.item.service.ItemService;
import demo.item.vo.ItemVO;
import demo.util.Utils;

@RestController
@RequestMapping("/item")
public class MItemController {

	@Autowired
	private ItemService service;
	@Autowired
	private CustomerTendencyService CTService;
	
	@RequestMapping(value="/sort/tendency", method=RequestMethod.GET)
	public List<ItemVO> SortTendency(@ModelAttribute CustomerTendencyVO CT){
		Utils u1 = new Utils(CTService.pullCT(22), service.pullAllItem(3));
		List<Integer> srls = u1.inputMapV2();
		List<ItemVO> sortedItem = new ArrayList<ItemVO>();

		for(int srl: srls){
			sortedItem.add(service.pullItem(srl));
		}
	
		return sortedItem;
	}
	
	@RequestMapping(value="/sort/no", method=RequestMethod.POST)
	public @ResponseBody List<ItemVO> notSort(){
		return service.pullAllItem(3);
	}
}
