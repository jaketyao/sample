/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.event.vo;

import java.sql.Date;

public class EventVO {
	private int itemSrl;
	private int srl;
	private Date joinDate;
	private Date endDate;
	private String status;
	public int getItemSrl() {
		return itemSrl;
	}
	public void setItemSrl(int itemSrl) {
		this.itemSrl = itemSrl;
	}
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Event [itemSrl=" + itemSrl + ", srl=" + srl + ", joinDate="
				+ joinDate + ", endDate=" + endDate + ", status=" + status
				+ "]";
	}
}
