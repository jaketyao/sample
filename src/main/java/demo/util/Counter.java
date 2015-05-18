package demo.util;

import java.util.ArrayList;
import java.util.List;

import demo.customerTendency.vo.CustomerTendencyVO;

public class Counter {
	
	List<CustomerTendencyVO> CT;
	Plus plus;
	
	public Counter(List<CustomerTendencyVO> CT){
		this.CT = CT;
	}
	
	public ArrayList<Double> stack(){
		for(int i=0; i<CT.size(); i++){
			CustomerTendencyVO cc = CT.get(i);
			plus = new Plus(cc.getSimple(), cc.getFancy(), cc.getCute(), cc.getLovely(), cc.getCasual(), cc.getPoint());
			plus.plusStack();
		}
		
		plus.average(CT.size());
		
		return plus.getAverage();
	}

}
