/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.event.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.event.service.EventService;
import demo.event.vo.EventVO;
import demo.item.service.ItemService;

@RestController
@RequestMapping("/event")
public class EventController {

	@Autowired
	private EventService service;
	@Autowired
	private ItemService itemService;
	
	// 이벤트 생성 이후 리스트 호출
	@RequestMapping(value="/add/process", method=RequestMethod.POST)
	public String EventAddProcess(@ModelAttribute EventVO event, HttpSession session){
		service.setEvent(event);
		session.setAttribute("itemSrl", event.getItemSrl());
		return "redirect:/event/list";
	}
	
	// 이벤트 리스트 itemList는 아이템의 목록 eventList는 이벤트의 목록을 보여준다
	@RequestMapping(value="/list")
	public String EventList(Model model, HttpSession session){
		int itemSrl = (Integer) session.getAttribute("itemSrl");
		model.addAttribute("eventList", service.pullAllEvent());
		model.addAttribute("itemList", itemService.pullAllItem(itemService.pullStoreSrl(itemSrl)));
		return "event/list";
	}
	
	// 이벤트 내용 보기
	@RequestMapping(value="/info", method=RequestMethod.GET)
	public String EventInfo(@RequestParam(defaultValue="0") int srl,
			@RequestParam(defaultValue="0") int itemSrl, Model model){
		int alpha=0;
		if(srl==0){
			alpha=itemSrl;
		} else {
			alpha=srl;
		}
		model.addAttribute("eventInfo", service.pullEvent(alpha));
		return "event/alter";
	}
	
	// 이벤트 내용 변경 페이지 호출
	@RequestMapping(value="/alter", method=RequestMethod.POST)
	public String EventAlter(@ModelAttribute EventVO event, Model model){
		model.addAttribute("eventInfo", event);
		return "event/alter";
	}
	
	// 이벤트 내용 변경 이후 리스트 호출
	@RequestMapping(value="/alter/process", method=RequestMethod.POST)
	public String EventAlterProcess(@ModelAttribute EventVO event, HttpSession session) {
		service.alterEvent(event);
		session.setAttribute("itemSrl", event.getItemSrl());
		return "redirect:/event/list";
	}
	
	// 아이템 삭제 이후 리스트 호출
	@RequestMapping(value="/delete/process", method=RequestMethod.POST)
	public String EventDeleteProcess(@ModelAttribute EventVO event,HttpSession session){
		service.deleteEvent(event.getItemSrl());
		session.setAttribute("itemSrl", event.getItemSrl());
		return "redirect:/event/list";
	}
}
