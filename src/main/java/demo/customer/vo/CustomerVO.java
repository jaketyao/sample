/*
* 작성일 : 2015. 5. 19.
* 작성자 : Administrator
*
* 설명
*/
package demo.customer.vo;

import java.sql.Date;

public class CustomerVO {
	private int srl;
	private String email;
	private String password;
	private int mailing;
	private String name;
	private Date birthDate;
	private String phone;
	private String location;
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
	public int getMailing() {
		return mailing;
	}
	public void setMailing(int mailing) {
		this.mailing = mailing;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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
		return "Customer [srl=" + srl + ", email=" + email + ", password="
				+ password + ", mailing=" + mailing + ", name=" + name
				+ ", birthDate=" + birthDate + ", phone=" + phone
				+ ", location=" + location + ", joinDate=" + joinDate
				+ ", lastLoginDate=" + lastLoginDate + ", alterDate="
				+ alterDate + "]";
	}
	
	

}
