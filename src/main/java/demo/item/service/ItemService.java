/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.item.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.item.dao.ItemDAO;
import demo.item.vo.ItemVO;

@Service
public class ItemService {

	@Autowired
	ItemDAO dao;
	
	public int inputItem(ItemVO item) {
		return dao.inputItem(item);
	}

	public ItemVO pullItem(int srl) {
		return dao.pullItem(srl);
	}

	public int alterItem(ItemVO item) {
		return dao.alterItem(item);
	}

	public int delete(int storeSrl, int srl) {
		return dao.deleteItem(storeSrl,srl);
	}

	public List<ItemVO> pullAllItem(int storeSrl) {
		return dao.pullAllItem(storeSrl);
	}

	public int pullStoreSrl(int srl) {
		return dao.pullStoreSrl(srl);
	}
}
