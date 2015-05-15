/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.exception
 * </PRE>
 * @file   : CommonRuntimeException.java
 * @date   : 2015. 5. 15. 오후 2:36:42
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.exception;

/**
 * <PRE>
 *  ClassName : CommonRuntimeException
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:36:42
 * @author  : jkkim
 * @brief   :
 */

public class CommonRuntimeException extends RuntimeException{

	private static final long serialVersionUID = -2300795871429515503L;

	public CommonRuntimeException(String message){
		super(message);
	}

}
