/**
 * <PRE>
 *  Project : demo
 *  Package : demo.framework.security.filter
 * </PRE>
 * @file   : LoginProcessHandler.java
 * @date   : 2015. 5. 15. 오후 3:02:59
 * @author : jkkim
 * @brief  :
 *  변경이력    :
 *        이름     : 일자          : 근거자료   : 변경내용
 *       ------------------------------------
 *        jkkim  : 2015. 5. 15.       :            : 신규 개발.
 */
package demo.framework.security.filter;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * <PRE>
 *  ClassName : LoginProcessHandler
 * </PRE>
 * @version : 1.0
 * @date    : 2015. 5. 15. 오후 3:02:59
 * @author  : jkkim
 * @brief   :
 */

public class LoginProcessFilter extends UsernamePasswordAuthenticationFilter{


	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

		if ("application/json".equals(request.getHeader("Content-Type"))) {
            try {

            	StringBuffer sb = new StringBuffer();
                String line = null;

                BufferedReader reader = request.getReader();
                while ((line = reader.readLine()) != null){
                    sb.append(line);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

		return super.attemptAuthentication(request, response);
	}

}


