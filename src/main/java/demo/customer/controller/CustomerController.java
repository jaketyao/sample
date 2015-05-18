/*
 * 작성일 : 2015. 5. 19.
 * 작성자 : Administrator
 *
 * 설명
 */
package demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.customer.service.CustomerService;
import demo.customer.vo.CustomerVO;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	// 고객 리스트 페이지를 호출한다
	// *현재 매장은 하나라고 가정하기 때문에 pullAllCustomer에 별도의 파라미터는 없다
	@RequestMapping(value = "/list")
	public String CustomerList(Model model) {
		model.addAttribute("customerList", service.pullAllCustomer());
		return "customer/list";
	}

	// 고객 추가 페이지 호출
	@RequestMapping(value = "/add")
	public String CustomerAdd() {
		return "customer/add";
	}

	// 고객 추가 완료페이지 호출
	// 여기서 고객성향 입력 버튼, 고객 리스트로 돌아가기 버튼을 둔다
	@RequestMapping(value = "/add/process", method = RequestMethod.POST)
	public String CustomerAddProcess(@ModelAttribute CustomerVO customer) {
		service.customerJoinCheck(customer);
		return "customer/addcomplete";
	}

	// 고객리스트에서 특정 고객의 고개정보를 선택하면 수정, 삭제 가능한 페이지 호출
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String CustomerInfo(@RequestParam(defaultValue = "0") int srl,
			Model model) {
		model.addAttribute("customerInfo", service.pullCustomer(srl));
		return "customer/info";
	}

	// 고객정보 수정 페이지 호출
	@RequestMapping(value = "/alter", method = RequestMethod.GET)
	public String CustomerAlter(@RequestParam(defaultValue = "0") int srl,
			Model model) {
		model.addAttribute("customer", service.pullCustomer(srl));
		return "customer/alter";
	}

	// 고객정보를 수정하고 리스트로 돌아감
	@RequestMapping(value = "/alter/process", method = RequestMethod.POST)
	public String CustomerAlterProcess(@ModelAttribute CustomerVO customer) {
		service.updateCustomerCheck(customer);
		return "redirect:/customer/list";
	}

	// 고객정보를 삭제하고 리스트로 돌아감
	// 추후 고객이 잔액을 갖고 있는지 체크하는 기능 추가해야함
	@RequestMapping(value = "/delete/process", method = RequestMethod.POST)
	public String CustomerDeleteProcess(@RequestParam String email) {
		service.deleteCustomerCheck(email);
		return "redirect:/customer/list";
	}

}
