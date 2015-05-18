package demo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import demo.customerTendency.vo.CustomerTendencyVO;
import demo.item.vo.ItemVO;

public class Utils {
	
	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	int[] ring;
	int i;
	CustomerTendencyVO me;
	List<ItemVO> your;
	
	public Utils(CustomerTendencyVO me, List<ItemVO> your){
		this.me = me;
		this.your = your;
	}
	
//	public List<Integer> values(){
//		QuickSort quck = new QuickSort();
//		quck.quickSort(ring, 0, ring.length-1);
//		List<Integer> l = new ArrayList<Integer>();
//		
//		for(int i=0; i<ring.length; i++){
//			l.add(m.get(ring[ring.length-i-1])); // value에 들어있던 item들의 srl값들을 입력
//		}
//		return l; // 리턴 값은 필터링된 값이 높은 순서대로 Srl들의 리스트 이다.
//		
//	}

	private int filtering(CustomerTendencyVO me, ItemVO you) {
		int a = 10 - Math.abs(me.getCasual() - you.getCasual());
		int b = 10 - Math.abs(me.getCute() - you.getCute());
		int c = 10 - Math.abs(me.getFancy() - you.getFancy());
		int d = 10 - Math.abs(me.getLovely() - you.getLovely());
		int e = 10 - Math.abs(me.getPoint() - you.getPoint());
		int f = 10 - Math.abs(me.getSimple() - you.getSimple());
		return (a + b + c + d + e + f);
	}

//	// customer의 성향과 item들으 성향을 필터링한다
//	void inputMap(CustomerTendency me, List<Item> your) {
//		ring = new int[your.size()];
//
//		for (Item you : your) {
//			int f = filtering(me, you);
//			m.put(f, you.getSrl());
//			ring[i] = f;
//			i++;
//		}
//	}
	
	public List<Integer> inputMapV2() {
		for(ItemVO you : your) {
			int f = filtering(me, you);
			m.put(you.getSrl(), f);
		}
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(m);
		Iterator<Integer> iterator = tm.descendingKeySet().iterator();
		
		List<Integer> l = new ArrayList<Integer>();
		while(iterator.hasNext()) {
			l.add(tm.get(iterator.next()));
		}
		
		return l;
	}
	
}
