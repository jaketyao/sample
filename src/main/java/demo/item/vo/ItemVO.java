/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.item.vo;

public class ItemVO {

	private int storeSrl;
	private int srl;
	private String title;
	private String content;
	private int price;
	private int simple;
	private int fancy;
	private int cute;
	private int lovely;
	private int casual;
	private int point;
	private String photo;
	
	public int getStoreSrl() {
		return storeSrl;
	}
	public void setStoreSrl(int storeSrl) {
		this.storeSrl = storeSrl;
	}
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "ItemVO [storeSrl=" + storeSrl + ", srl=" + srl + ", title="
				+ title + ", content=" + content + ", price=" + price
				+ ", simple=" + simple + ", fancy=" + fancy + ", cute=" + cute
				+ ", lovely=" + lovely + ", casual=" + casual + ", point="
				+ point + ", photo=" + photo + "]";
	}
	
}
