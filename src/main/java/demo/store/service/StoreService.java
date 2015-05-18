/*
* 작성일 : 2015. 5. 18.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.store.dao.StoreDAO;
import demo.store.vo.StoreVO;

@Service
public class StoreService {

	@Autowired
	StoreDAO dao;
	
	public String joinStore(StoreVO store) {
		if(dao.joinStore(store)==1)
			return "success";
		else return "fail";
	}

	public String updateStore(StoreVO store) {
		if(dao.updateStore(store)==1)
			return "success";
		else return "fail";
	}

	public String deleteStore(String email) {
		if(dao.deleteStore(email)==1)
			return "success";
		else return "fail";
	}

	public String pullPwStore(String email) {
		return dao.pullPwStore(email);
	}

	public StoreVO findStore(String email) {
		return dao.findStore(email);
	}

	public StoreVO loginStore(String email, String password) {
		return dao.loginStore(email, password);
	}


	
}
