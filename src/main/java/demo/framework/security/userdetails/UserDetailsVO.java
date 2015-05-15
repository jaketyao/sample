/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.security.vo
 * </PRE>
 * @file   : UserDetailsVO.java
 * @date   : 2015. 5. 15. 오후 3:29:17
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.security.userdetails;

/**
 * <PRE>
 *  ClassName : UserDetailsVO
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 3:29:17
 * @author  : jkkim
 * @brief   :
 */

public class UserDetailsVO {

	private String userId;
	private String userNm;
	private String roleId;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userNm
	 */
	public String getUserNm() {
		return userNm;
	}
	/**
	 * @param userNm the userNm to set
	 */
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	/**
	 * @return the roleId
	 */
	public String getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetailsVO [userId=" + userId + ", userNm=" + userNm
				+ ", roleId=" + roleId + "]";
	}

}


