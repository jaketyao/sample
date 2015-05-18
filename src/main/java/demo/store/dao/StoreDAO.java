/*
* 작성일 : 2015. 5. 18.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.dao;

import demo.store.vo.StoreVO;

public interface StoreDAO {
	public int joinStore(StoreVO store);
	public int updateStore(StoreVO store);
	public int deleteStore(String email);
	public String pullPwStore(String email);
	public StoreVO findStore(String email);
	public StoreVO loginStore(String email, String password);
}
