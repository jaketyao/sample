/*
* 작성일 : 2015. 5. 18.
* 작성자 : Administrator
*
* 설명
*/
package demo.store.vo;

import java.sql.Date;

public class StoreVO {

	private int srl;
	private String email;
	private String password;
	private String phone;
	private String location;
	private String division;
	private int worker;
	private String crn;
	private String shortInfo;
	private String detailInfo;
	private Date joinDate;
	private Date lastLoginDate;
	private Date alterDate;
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getWorker() {
		return worker;
	}
	public void setWorker(int worker) {
		this.worker = worker;
	}
	public String getCrn() {
		return crn;
	}
	public void setCrn(String crn) {
		this.crn = crn;
	}
	public String getShortInfo() {
		return shortInfo;
	}
	public void setShortInfo(String shortInfo) {
		this.shortInfo = shortInfo;
	}
	public String getDetailInfo() {
		return detailInfo;
	}
	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Date getAlterDate() {
		return alterDate;
	}
	public void setAlterDate(Date alterDate) {
		this.alterDate = alterDate;
	}
	@Override
	public String toString() {
		return "Store [srl=" + srl + ", email=" + email + ", password="
				+ password + ", phone=" + phone + ", location=" + location
				+ ", division=" + division + ", worker=" + worker + ", crn="
				+ crn + ", shortInfo=" + shortInfo + ", detailInfo="
				+ detailInfo + ", joinDate=" + joinDate + ", lastLoginDate="
				+ lastLoginDate + ", alterDate=" + alterDate + "]";
	}
	
}
