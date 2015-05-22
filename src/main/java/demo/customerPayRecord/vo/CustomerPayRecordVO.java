/*
* 작성일 : 2015. 5. 22.
* 작성자 : Administrator
*
* 설명
*/
package demo.customerPayRecord.vo;

import java.sql.Date;

public class CustomerPayRecordVO {

	private int customerSrl;
	private int srl;
	private Date useDate;
	private int useBalance;
	private String useBalanceContent;
	private int prepayment;
	public int getCustomerSrl() {
		return customerSrl;
	}
	public void setCustomerSrl(int customerSrl) {
		this.customerSrl = customerSrl;
	}
	public int getSrl() {
		return srl;
	}
	public void setSrl(int srl) {
		this.srl = srl;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public int getUseBalance() {
		return useBalance;
	}
	public void setUseBalance(int useBalance) {
		this.useBalance = useBalance;
	}
	public String getUseBalanceContent() {
		return useBalanceContent;
	}
	public void setUseBalanceContent(String useBalanceContent) {
		this.useBalanceContent = useBalanceContent;
	}
	public int getPrepayment() {
		return prepayment;
	}
	public void setPrepayment(int prepayment) {
		this.prepayment = prepayment;
	}
	@Override
	public String toString() {
		return "CustomerPayRecordVO [customerSrl=" + customerSrl + ", srl="
				+ srl + ", useDate=" + useDate + ", useBalance=" + useBalance
				+ ", useBalanceContent=" + useBalanceContent + ", prepayment="
				+ prepayment + "]";
	}
	
}
