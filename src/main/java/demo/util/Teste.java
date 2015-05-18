package demo.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Teste {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("ㅅㅂ", 1);
		map.put("ㅅㅂ3", 3);
		map.put("ㅅㅂ2", 2);
		map.put("ㅅㅂ6", 6);
		map.put("ㅅㅂ33", 3);
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(map);
		
		
		
		Iterator<String> iterator = tm.keySet().iterator();
		
		while(iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key+","+tm.get(key));
		}
	}

}
