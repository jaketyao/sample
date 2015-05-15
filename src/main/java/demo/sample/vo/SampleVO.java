/**
 * <PRE>
 *  Project : demo
 *  Package : demo.sample.vo
 * </PRE>
 * @file   : SampleVO.java
 * @date   : 2015. 5. 15. 오후 1:48:29
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.sample.vo;

/**
 * <PRE>
 *  ClassName : SampleVO
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 1:48:29
 * @author  : jkkim
 * @brief   :
 */

public class SampleVO {

	private String field1;
	private String field2;
	/**
	 * @return the field1
	 */
	public String getField1() {
		return field1;
	}
	/**
	 * @param field1 the field1 to set
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}
	/**
	 * @return the field2
	 */
	public String getField2() {
		return field2;
	}
	/**
	 * @param field2 the field2 to set
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SampleVO [field1=" + field1 + ", field2=" + field2 + "]";
	}

}
