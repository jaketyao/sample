/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.event.dao;

import java.util.List;

import demo.event.vo.EventVO;


public interface EventDAO {

	int setEvent(EventVO event);
	int alterEvent(EventVO event);
	int deleteEvent(int itemSrl);
	EventVO pullEvent(int itemSrl);
	List<EventVO> pullAllEvent();
}
