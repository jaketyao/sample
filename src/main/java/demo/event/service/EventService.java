/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.event.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.event.dao.EventDAO;
import demo.event.vo.EventVO;

@Service
public class EventService {

	@Autowired
	EventDAO dao;
	
	public int setEvent(EventVO event) {
		return dao.setEvent(event);
	}

	public int alterEvent(EventVO event) {
		return dao.alterEvent(event);
	}

	public int deleteEvent(int itemSrl) {
		return dao.deleteEvent(itemSrl);
	}

	public EventVO pullEvent(int itemSrl) {
		return dao.pullEvent(itemSrl);
	}

	public List<EventVO> pullAllEvent() {
		return dao.pullAllEvent();
	}
}
