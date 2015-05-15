/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.security.filter
 * </PRE>
 * @file   : LoginFailureHandler.java
 * @date   : 2015. 5. 15. 오후 2:57:24
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.security.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import demo.framework.response.BaseResponse;

/**
 * <PRE>
 *  ClassName : LoginFailureHandler
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 2:57:24
 * @author  : jkkim
 * @brief   :
 */

public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler{

	private static final Logger logger = LoggerFactory.getLogger(LoginFailureHandler.class);


	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException auth) throws IOException, ServletException {

		logger.debug("LOGIN FAIL : onAuthenticationFailure");

		ObjectMapper mapper = new ObjectMapper();
		if ("application/json".equals(request.getHeader("Content-Type"))) {
			BaseResponse baseResponse = new BaseResponse();
			baseResponse.setResponseNG();
			baseResponse.setMessage("로그인 실패");
			mapper.writeValue(response.getWriter(), baseResponse);
		}
	}

}
