/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerTendency.vo;

public class CustomerTendencyVO {
	private int customerSrls;
	private int srl;
	private int simple;
	private int fancy;
	private int cute;
	private int lovely;
	private int casual;
	private int point;
	public int getCustomerSrls() {
		return customerSrls;
	}
	public void setCustomerSrls(int customerSrls) {
		this.customerSrls = customerSrls;
	}
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public int getSimple() {
		return simple;
	}
	public void setSimple(int simple) {
		this.simple = simple;
	}
	public int getFancy() {
		return fancy;
	}
	public void setFancy(int fancy) {
		this.fancy = fancy;
	}
	public int getCute() {
		return cute;
	}
	public void setCute(int cute) {
		this.cute = cute;
	}
	public int getLovely() {
		return lovely;
	}
	public void setLovely(int lovely) {
		this.lovely = lovely;
	}
	public int getCasual() {
		return casual;
	}
	public void setCasual(int casual) {
		this.casual = casual;
	}
	public int getPoint() {
		return point;	
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "CustomerTendency [customerSrls=" + customerSrls + ", srl="
				+ srl + ", simple=" + simple + ", fancy=" + fancy + ", cute="
				+ cute + ", lovely=" + lovely + ", casual=" + casual
				+ ", point=" + point + "]";
	}

}
