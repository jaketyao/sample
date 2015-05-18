/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.item.dao;

import java.util.List;

import demo.item.vo.ItemVO;

public interface ItemDAO {

	int inputItem(ItemVO item);
	ItemVO pullItem(int srl);
	int alterItem(ItemVO item);
	int deleteItem(int storeSrl, int srl);
	List<ItemVO> pullAllItem(int storeSrl);
	int pullStoreSrl(int srl);
}
