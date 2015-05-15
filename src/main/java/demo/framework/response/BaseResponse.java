/**
 * <PRE>
 *  Project : demo
 *  Package : BaseResponse
 * </PRE>
 * @file   : BaseResponse.java
 * @date   : 2015. 5. 15. 오후 2:10:15
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.response;

import java.io.Serializable;

/**
 * <PRE>
 *  ClassName : BaseResponse
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:10:15
 * @author  : jkkim
 * @brief   :
 */

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 5468480346176063191L;

	private String responseCode;

	private String message;

    private Object data;

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public void setResponseOK() {
        this.responseCode = "OK";
    }

    public void setResponseNG() {
        this.responseCode = "NG";
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseResponse [responseCode=" + responseCode + ", message="
				+ message + ", data=" + data + "]";
	}

}
