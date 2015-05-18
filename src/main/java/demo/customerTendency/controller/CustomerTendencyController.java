/*
 * 작성일 : 2015. 5. 19.
 * 작성자 : Administrator
 *
 * 설명
 */
package demo.customerTendency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customerTendency.service.CustomerTendencyService;
import demo.customerTendency.vo.CustomerTendencyVO;
import demo.util.Counter;

@RestController
@RequestMapping("/CustomerTendency")
public class CustomerTendencyController {

	@Autowired
	private CustomerTendencyService service;
	
	// 고객 성향 입력 페이지 호출
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String CustomerAddCustomerTendency(
			@RequestParam int srl, Model model){
		
		model.addAttribute("customerSrls", srl);
		return "customerTendency/add";
	}

	// 성향정보 입력 완료 페이지 호출
	@RequestMapping(value = "/input/process", method = RequestMethod.POST)
	public String CustomerTendencyInputProcess(
			@ModelAttribute CustomerTendencyVO CT) {
		service.inputCT(CT);
		return "customerTendency/inputComplete";
	}

	// 성향 수정 페이지
	@RequestMapping(value = "/alter", method = RequestMethod.GET)
	public String CustomerTendencyAlter(@RequestParam int customerSrls,
			Model model) {
		model.addAttribute("tendencyInfo", service.pullCT(customerSrls));
		return "customerTendency/alter";
	}

	// 성향 수정 완료 페이지 호출
	@RequestMapping(value = "/alter/process", method = RequestMethod.POST)
	public String CustomerTendencyAlterProcess(
			@ModelAttribute CustomerTendencyVO CT) {
		service.updateCT(CT);
		return "customerTendency/alterComplete";
	}

	// 고객 성향의 평균갑
	@RequestMapping(value = "/average")
	public String CustomerTendencyAverage(Model model) {
		Counter counter = new Counter(service.pullAllCT());
		model.addAttribute("CTaverage", counter.stack());
		return "customerTendency/average";
	}
	
	
}
