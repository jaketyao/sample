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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customerTendency.service.CustomerTendencyService;
import demo.item.service.ItemService;
import demo.item.vo.ItemVO;
import demo.util.Utils;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService service;
	@Autowired
	private CustomerTendencyService CTService;
	
	// 아이템 입력 페이지 호출
		@RequestMapping(value="/input")
		public String ItemInputPage(){
			return "item/input";
		}
		// 아이템 입력이후 리스트 호출
		@RequestMapping(value="/input/process", method=RequestMethod.POST)
		public String ItemInputProcess(@ModelAttribute ItemVO item, Model model) {
			service.inputItem(item);
			return "redirect:/item/list";
		}
		
		// 리스트 호출
		@RequestMapping(value="/list", method=RequestMethod.GET)
		public String ItemList(
				@RequestParam(defaultValue="3") int storeSrl, 
				@RequestParam(defaultValue="0") int sort,
				Model model) {
			
			if(sort == 0 ) {	//비정렬
				model.addAttribute("itemList", service.pullAllItem(storeSrl));
			} else if(sort ==1) {	//정렬
				Utils u1 = new Utils(CTService.pullCT(22), service.pullAllItem(storeSrl));
				List<Integer> srls = u1.inputMapV2();
				List<ItemVO> sortedItem = new ArrayList<ItemVO>();
				for(int srl: srls){
					sortedItem.add(service.pullItem(srl));
				}
				model.addAttribute("itemList", sortedItem);
			}
			
			return "item/itemList";
		}
		
		// 아이템 내용 보기
		@RequestMapping(value="/viewItem", method=RequestMethod.GET)
		public String ItemView(@RequestParam int srl, Model model){
			model.addAttribute("selectedItem", service.pullItem(srl));
			return "item/selectItem";
		}
		
		// 아이템 내용 수정
		@RequestMapping(value="/alteritem", method=RequestMethod.POST)
		public String ItemAlter(@ModelAttribute ItemVO item, Model model){
			model.addAttribute("selectedItem", item);
			return "item/alteritem";
		}
		
		// 아이템 내용 수정 이후 내용 보기 호출
		@RequestMapping(value="/alteritem/process", method=RequestMethod.POST)
		public String ItemAlterProcess(@ModelAttribute ItemVO item){
			service.alterItem(item);
			return "redirect:/item/viewItem";
		}

		// 아이템 삭제
		@RequestMapping(value="/delete/process", method=RequestMethod.POST)
		public String ItemDeleteProcess(@RequestParam int storeSrl, @RequestParam int srl){
			service.delete(storeSrl, srl);
			return "redirect:/item/list";
		}
		
		// 이벤트 생성 페이지를 호출
		@RequestMapping(value="/event", method=RequestMethod.GET)
		public String ItemEvent(@RequestParam int srl, Model model){
			model.addAttribute("itemSrl", service.pullItem(srl));
			return "event/add";
		}
}
